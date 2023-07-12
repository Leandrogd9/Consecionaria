package com.mycompany.concesionaria.logica;
import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    ControladoraPersistencia control = new ControladoraPersistencia();
    
    public ControladoraLogica() {
    }
    
    public void guardarAutomovil(String modelo, String marca, String motor, String color, String patente, String puerta) {
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuerta(puerta);
        
        control.guardarAutomovil(auto);
    }

    public List<Automovil> traerAutomoviles() {
        return control.traerAutomoviles();
    }

    public void borrarAutomovil(int id) {
        control.borrarAutomovil(id);
    }

    public Automovil traerAuto(int id) {
        return control.traerAuto(id);
    }

    public void editarAutomovil(String modelo, String marca, String motor, String color, String patente, String puerta, Automovil auto) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuerta(puerta);
        
        control.editarAutomovil(auto);
    }
}
