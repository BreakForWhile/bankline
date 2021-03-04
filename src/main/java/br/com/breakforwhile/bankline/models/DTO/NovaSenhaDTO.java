package br.com.breakforwhile.bankline.models.DTO;

public class NovaSenhaDTO {

    private String email;
    private String login;

    public NovaSenhaDTO() {

    }

    public NovaSenhaDTO(String email, String login) {
        this.email = email;
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "NovaSenhaDTO{" +
                "email='" + email + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
