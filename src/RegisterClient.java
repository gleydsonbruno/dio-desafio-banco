public class RegisterClient {
    String nome;
    String login;
    String senha;
    String email;
    boolean contaCriada = false;

    public RegisterClient(String nome, String login, String senha, String email) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        contaCriada = true;
    };

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
