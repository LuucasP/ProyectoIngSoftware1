package bean;


public class Empleado {

   String dni,nom,apepat,apemat,fecnac,email,pass,rango,obser;

    public Empleado() {
    }

    public Empleado(String dni, String nom, String apepat, String apemat, String fecnac, String email, String pass, String rango, String obser) {
        this.dni = dni;
        this.nom = nom;
        this.apepat = apepat;
        this.apemat = apemat;
        this.fecnac = fecnac;
        this.email = email;
        this.pass = pass;
        this.rango = rango;
        this.obser = obser;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }
   
   
   
    
}
