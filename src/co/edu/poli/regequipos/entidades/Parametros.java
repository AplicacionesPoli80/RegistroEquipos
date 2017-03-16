package co.edu.poli.regequipos.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanm
 */
@Entity
@Table(name = "parametros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametros.findAll", query = "SELECT p FROM Parametros p")
    , @NamedQuery(name = "Parametros.findByIdParam", query = "SELECT p FROM Parametros p WHERE p.parametrosPK.idParam = :idParam")
    , @NamedQuery(name = "Parametros.findByValorParam", query = "SELECT p FROM Parametros p WHERE p.parametrosPK.valorParam = :valorParam")
    , @NamedQuery(name = "Parametros.findByDescParam", query = "SELECT p FROM Parametros p WHERE p.descParam = :descParam")})
public class Parametros implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosPK parametrosPK;
    @Basic(optional = false)
    @Column(name = "DESC_PARAM")
    private String descParam;

    public Parametros() {
    }

    public Parametros(ParametrosPK parametrosPK) {
        this.parametrosPK = parametrosPK;
    }

    public Parametros(ParametrosPK parametrosPK, String descParam) {
        this.parametrosPK = parametrosPK;
        this.descParam = descParam;
    }

    public Parametros(String idParam, String valorParam) {
        this.parametrosPK = new ParametrosPK(idParam, valorParam);
    }

    public ParametrosPK getParametrosPK() {
        return parametrosPK;
    }

    public void setParametrosPK(ParametrosPK parametrosPK) {
        this.parametrosPK = parametrosPK;
    }

    public String getDescParam() {
        return descParam;
    }

    public void setDescParam(String descParam) {
        this.descParam = descParam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosPK != null ? parametrosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametros)) {
            return false;
        }
        Parametros other = (Parametros) object;
        if ((this.parametrosPK == null && other.parametrosPK != null) || (this.parametrosPK != null && !this.parametrosPK.equals(other.parametrosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.poli.regequipos.entidades.Parametros[ parametrosPK=" + parametrosPK + " ]";
    }
    
}
