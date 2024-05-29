package session;
import com.esportfy.esportfyb.entities.Usuario;
public class SessaoSistema {
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
    }

    public boolean isNaoPossuiUsuarioLogado() {
        return usuarioLogado == null;
    }

}
