package co.com.citrino.citrino.model;

import javax.persistence.*;

@Entity
@Table(name = "ctxlocalizacion", schema = "dbcitrino" )
public class CtxLocalizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlocalizacion")
    private Long idLocalizacion;

    @Column(name = "emp_emp")
    private Long idCompany;

    @Column(name = "ciudad")
    private String city;

    @Column(name = "pais")
    private String country;

    public Long getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Long idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String contry) {
        this.country = contry;
    }
}
