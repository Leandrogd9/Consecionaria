package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    AutomovilJpaController control = new AutomovilJpaController();

    public void guardarAutomovil(Automovil auto) {
        control.create(auto);
    }

    public List<Automovil> traerAutomoviles() {
        return control.findAutomovilEntities();
    }

    public void borrarAutomovil(int id) {
        try {
            control.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int id) {
        return control.findAutomovil(id);
    }

    public void editarAutomovil(Automovil auto) {
        try {
            control.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
