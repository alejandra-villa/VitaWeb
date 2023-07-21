package co.edu.sena.vitaweb.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author avill
 */
@Entity
public class Afiliado implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    private int documento;
    private String nombres;
    private String apellidos;
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    private String telefono;
    private String correo;
    private String direccion;
    private int beneficiarios;
    
    public Afiliado() {
        
    }
    
    public Afiliado(int id, int documento, String nombres, String apellidos, Date fechaNac, String telefono, String correo, String direccion, int beneficiarios) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.beneficiarios = beneficiarios;
    }

    public int getId() {
        return id;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getBeneficiarios() {
        return beneficiarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setBeneficiarios(int beneficiarios) {
        this.beneficiarios = beneficiarios;
    }

    @Override
    public String toString() {
        return "Afiliado{" + "id=" + id + ", documento=" + documento + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", beneficiarios=" + beneficiarios + '}';
    }

    
}
