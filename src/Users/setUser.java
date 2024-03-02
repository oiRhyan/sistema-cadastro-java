package Users;

public class setUser {
    private String nome;
    private String email;
    private int senha;

    public setUser(String setName, String setEmail, int setPassword){
        this.nome = setName;
        this.email = setEmail;
        this.senha = setPassword;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Email: " + email + "\n" + "--------------";
    }

    public String getEmail(){
        return this.email;
    }

    public int getPassword(){
        return  this.senha;
    }

}
