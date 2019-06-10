/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


public class Reserva {

int idR,clifk;
String probfk,fec,hora,estado;

    public Reserva() {
    }

    public Reserva(int idR, int clifk, String probfk, String fec, String hora, String estado) {
        this.idR = idR;
        this.clifk = clifk;
        this.probfk = probfk;
        this.fec = fec;
        this.hora = hora;
        this.estado = estado;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public int getClifk() {
        return clifk;
    }

    public void setClifk(int clifk) {
        this.clifk = clifk;
    }

    public String getProbfk() {
        return probfk;
    }

    public void setProbfk(String probfk) {
        this.probfk = probfk;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }






}
