package co.com.citrino.citrino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "industria", schema = "dbcitrino" )
public class CtxClima {

    @Id
    @Column(name = "idclima")
    private Long idClima;

    @Column(name = "tipo")
    private String type;

    @Column(name = "emp_emp")
    private String idCompany;

    public Long getIdClima() {
        return idClima;
    }

    public void setIdClima(Long idClima) {
        this.idClima = idClima;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }
}
