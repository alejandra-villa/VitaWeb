package co.edu.sena.vitaweb.persistencia;

import co.edu.sena.vitaweb.logica.Afiliado;
import co.edu.sena.vitaweb.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author avill
 */
public class ControladorPersistencia {
    
    AfiliadoJpaController afiliadoJpa = new AfiliadoJpaController();
    
    public void crearAfiliado(Afiliado afiliado) {        
        
        afiliadoJpa.create(afiliado);
    }
    
    public List<Afiliado> traerAfiliados() {
        return afiliadoJpa.findAfiliadoEntities();
    }
    
    public void eliminarUsuario(int id) {
        
        try {
            afiliadoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    public Afiliado traerUsuario(int idModificar) {
        
        return afiliadoJpa.findAfiliado(idModificar);
    }

    public void modificarUsario(Afiliado afiliado) {
        
        try {
            afiliadoJpa.edit(afiliado);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
