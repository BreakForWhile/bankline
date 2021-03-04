package br.com.breakforwhile.bankline.models.DTO;

import br.com.breakforwhile.bankline.models.Usuario;

public class UsuarioDTO {

    private String cpf;
    private String login;
    private String nome;
    private String senha;

    public UsuarioDTO() {

    }

    public UsuarioDTO(Usuario usuario) {
        this.cpf   = usuario.getCpf();
        this.login = usuario.getLogin();
        this.nome  = usuario.getNome();
        this.senha = "#############";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario toUsuario(){
        Usuario usuario = new Usuario();
        usuario.setCpf(this.cpf);
        usuario.setLogin(this.login);
        usuario.setNome(this.nome);
        usuario.setSenha(this.senha);
        usuario.setSenhaTemporaria("");
        usuario.setRedefinirSenha(true);
        return usuario;
    }
}
