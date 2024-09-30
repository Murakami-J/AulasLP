public class Usuario {
    private String login;
    private String senha;
    private boolean ativo = true;

    // Criar um construtor apenas com login e senha e getters de todos


    public Usuario(String login, String senha, boolean ativo) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
