package session;

import com.esportfy.esportfyb.entities.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessaoSistema {

    private static final Logger logger = LoggerFactory.getLogger(SessaoSistema.class);

    private Usuario usuarioLogado;
    private static SessaoSistema instance;

    public static SessaoSistema getInstance() {
        if (instance == null) {
            instance = new SessaoSistema();
        }
        return instance;
    }
    public Usuario getUsuarioLogado() {
        return this.usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
        if (usuarioLogado != null) {
            logger.info("Usuário definido na sessão: " + usuarioLogado.getUsername());
        } else {
            logger.warn("Sessão sem Usuário");
        }
    }

    public boolean isNaoPossuiUsuarioLogado() {
        return usuarioLogado == null;
    }

}