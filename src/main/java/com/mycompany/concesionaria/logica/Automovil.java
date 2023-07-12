package com.mycompany.concesionaria.logica;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String patente;
    private String cantPuerta;

    public Automovil() {
    }

    public Automovil(int id, String modelo, String marca, String motor, String color, String patente, String cantPuerta) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.cantPuerta = cantPuerta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCantPuerta() {
        return cantPuerta;
    }

    public void setCantPuerta(String cantPuerta) {
        this.cantPuerta = cantPuerta;
    }
}
