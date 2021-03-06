package co.edu.poli.regequipos.entidades;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanm
 */
@Entity
@Table(name = "registro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r")
    , @NamedQuery(name = "Registro.findByIdRegistro", query = "SELECT r FROM Registro r WHERE r.idRegistro = :idRegistro")
    , @NamedQuery(name = "Registro.findByFechaIngreso", query = "SELECT r FROM Registro r WHERE r.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "Registro.findByFechaSalida", query = "SELECT r FROM Registro r WHERE r.fechaSalida = :fechaSalida")
    , @NamedQuery(name = "Registro.findByObservacion", query = "SELECT r FROM Registro r WHERE r.observacion = :observacion")})
public class Registro implements Serializable {

    @Basic(optional = false)
    @Column(name = "USUARIO_INGRESO")
    private String usuarioIngreso;
    @Column(name = "USUARIO_SALIDA")
    private String usuarioSalida;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_REGISTRO")
    private Integer idRegistro;
    @Basic(optional = false)
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaIngreso;
    @Column(name = "FECHA_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaSalida;
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumn(name = "SERIAL", referencedColumnName = "SERIAL")
    @ManyToOne(optional = false)
    private Equipo serial;

    public Registro() {
    }

    public Registro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Registro(Integer idRegistro, Timestamp fechaIngreso) {
        this.idRegistro = idRegistro;
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Timestamp getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Timestamp fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Timestamp getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Timestamp fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Equipo getSerial() {
        return serial;
    }

    public void setSerial(Equipo serial) {
        this.serial = serial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.poli.regequipos.entidades.Registro[ idRegistro=" + idRegistro + " ]";
    }

    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }

    public String getUsuarioSalida() {
        return usuarioSalida;
    }

    public void setUsuarioSalida(String usuarioSalida) {
        this.usuarioSalida = usuarioSalida;
    }
    
}
