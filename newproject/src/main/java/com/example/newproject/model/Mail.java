package com.example.newproject.model;

public class Mail {
    private String usrnm;
    private String email;
    private String psw;

    public Mail()
    {
        super();
    }



    public Mail(String usrnm, String email, String psw)
    {
        super();
        this.usrnm=usrnm;
        this.email=email;
        this.psw=psw;

    }

    public String getUsrnm() {
        return usrnm;
    }

    public void setUsrnm(String usrnm) {
        this.usrnm = usrnm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "mail{" +
                "usrnm='" + usrnm + '\'' +
                ", email='" + email + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
