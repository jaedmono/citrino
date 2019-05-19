package co.com.citrino.citrino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfilestrategia", schema = "dbcitrino")
public class PerfilEstrategia {

    @Id
    @Column(name = "pest_pest")
    private Long idPest;

    @Column(name = "pest_nombre")
    private String pestNombre;

    @Column(name = "pest_seleccion")
    private String pestSeleccion;

    @Column(name = "emp_emp")
    private Long idCompany;

    public Long getIdPest() {
        return idPest;
    }

    public void setIdPest(Long idPest) {
        this.idPest = idPest;
    }

    public String getPestNombre() {
        return pestNombre;
    }

    public void setPestNombre(String pestNombre) {
        this.pestNombre = pestNombre;
    }

    public String getPestSeleccion() {
        return pestSeleccion;
    }

    public void setPestSeleccion(String pestSeleccion) {
        this.pestSeleccion = pestSeleccion;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }
}
