
package bean;


public class ReservaCliente {
int idr;
String nom,nomprob,fecres,horares,estado;

    public ReservaCliente() {
    }

    public ReservaCliente(int idr, String nom, String nomprob, String fecres, String horares, String estado) {
        this.idr = idr;
        this.nom = nom;
        this.nomprob = nomprob;
        this.fecres = fecres;
        this.horares = horares;
        this.estado = estado;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomprob() {
        return nomprob;
    }

    public void setNomprob(String nomprob) {
        this.nomprob = nomprob;
    }

    public String getFecres() {
        return fecres;
    }

    public void setFecres(String fecres) {
        this.fecres = fecres;
    }

    public String getHorares() {
        return horares;
    }

    public void setHorares(String horares) {
        this.horares = horares;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

 

   
    
}
