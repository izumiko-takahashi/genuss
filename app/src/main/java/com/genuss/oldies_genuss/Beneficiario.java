package com.genuss.oldies_genuss;

/**
 * Created by user on 21/02/2016.
 */
public class Beneficiario {
    private String name;
    private String apPaterno;
    private String matPaterno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getMatPaterno() {
        return matPaterno;
    }

    public void setMatPaterno(String matPaterno) {
        this.matPaterno = matPaterno;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String fechaNac;
    private String email;



}

