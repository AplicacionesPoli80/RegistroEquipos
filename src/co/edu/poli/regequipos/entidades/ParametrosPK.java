package co.edu.poli.regequipos.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author juanm
 */
@Embeddable
public class ParametrosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_PARAM")
    private String idParam;
    @Basic(optional = false)
    @Column(name = "VALOR_PARAM")
    private String valorParam;

    public ParametrosPK() {
    }

    public ParametrosPK(String idParam, String valorParam) {
        this.idParam = idParam;
        this.valorParam = valorParam;
    }

    public String getIdParam() {
        return idParam;
    }

    public void setIdParam(String idParam) {
        this.idParam = idParam;
    }

    public String getValorParam() {
        return valorParam;
    }

    public void setValorParam(String valorParam) {
        this.valorParam = valorParam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParam != null ? idParam.hashCode() : 0);
        hash += (valorParam != null ? valorParam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosPK)) {
            return false;
        }
        ParametrosPK other = (ParametrosPK) object;
        if ((this.idParam == null && other.idParam != null) || (this.idParam != null && !this.idParam.equals(other.idParam))) {
            return false;
        }
        if ((this.valorParam == null && other.valorParam != null) || (this.valorParam != null && !this.valorParam.equals(other.valorParam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.poli.regequipos.entidades.ParametrosPK[ idParam=" + idParam + ", valorParam=" + valorParam + " ]";
    }
    
}
