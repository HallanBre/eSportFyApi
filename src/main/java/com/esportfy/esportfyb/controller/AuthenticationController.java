package com.esportfy.esportfyb.controller;

import com.esportfy.esportfyb.dto.AuthenticationDto;
import com.esportfy.esportfyb.dto.LoginResponseDto;
import com.esportfy.esportfyb.dto.RegisterDto;
import com.esportfy.esportfyb.entities.Usuario;
import com.esportfy.esportfyb.infra.security.TokenService;
import com.esportfy.esportfyb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import session.SessaoSistema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private TokenService tokenService;


    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Validated AuthenticationDto data) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.name(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((Usuario) auth.getPrincipal());
        Usuario usuarioAutenticado = (Usuario) auth.getPrincipal();
        var user = (Usuario) auth.getPrincipal();


        SessaoSistema.getInstance().setUsuarioLogado(usuarioAutenticado);
        /*.setUsuario(usuarioRepository.findById(SessaoSistema.getInstance().getUsuarioLogado().getId()).get());*/

        if (SessaoSistema.getInstance().getUsuarioLogado() != null) {
            logger.info("Usuário logado: " + SessaoSistema.getInstance().getUsuarioLogado().getUsername());
        } else {
            logger.error("Nenhum usuário na sessão");
        }
        return ResponseEntity.ok(new LoginResponseDto(user, token));
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout() {

        SessaoSistema.getInstance().setUsuarioLogado(null);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/session")
    public ResponseEntity<Usuario> session() {
        System.out.println("USUARIO SESSAO0---------------" + SessaoSistema.getInstance().getUsuarioLogado().toString());
        return ResponseEntity.ok(SessaoSistema.getInstance().getUsuarioLogado());
    }

    @PostMapping("/cadastro")
    public ResponseEntity cadastro(@RequestBody @Validated RegisterDto data){
        if(this.repository.findByEmail(data.email()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        Usuario newUser = new Usuario(data.name(), data.email(), encryptedPassword,  data.role(), data.date());

        this.repository.save(newUser);

        return ResponseEntity.ok().build();
    }

}
