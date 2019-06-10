package bean;


public class Cliente {

String nom,apepat,apemat,fecnac,email,pass;

    public Cliente() {
    }

    public Cliente(String nom, String apepat, String apemat, String fecnac, String email, String pass) {
        this.nom = nom;
        this.apepat = apepat;
        this.apemat = apemat;
        this.fecnac = fecnac;
        this.email = email;
        this.pass = pass;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getFecnac() {
        return fecnac;
    }

    public void setFecnac(String fecnac) {
        this.fecnac = fecnac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


  

    
}
