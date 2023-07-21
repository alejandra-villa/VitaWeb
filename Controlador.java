
package co.edu.sena.vitaweb.logica;

import co.edu.sena.vitaweb.persistencia.ControladorPersistencia;
import java.util.List;

/**
 *
 * @author avill
 */
public class Controlador {
    
    ControladorPersistencia persistenciaControl = new ControladorPersistencia();
    
    public void crearAfiliado(Afiliado afiliado) {        
        
        persistenciaControl.crearAfiliado(afiliado);
    }
    
    public List<Afiliado> traerUsuarios() {
        return persistenciaControl.traerAfiliados();
    }
    
    public void eliminarUsuario(int id) {
        
        persistenciaControl.eliminarUsuario(id);
    }

    public Afiliado traerUsuario(int idModificar) {
        
        return persistenciaControl.traerUsuario(idModificar);
    }

    public void modificarAfiliado(Afiliado afiliado) {
        
        persistenciaControl.modificarUsario(afiliado);
    }
}
