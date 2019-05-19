package co.com.citrino.citrino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ctxtemporada", schema = "dbcitrino")
public class CtxTemporada {

    @Id
    @Column(name = "idtemporada")
    private Long idSeason;

    @Column(name = "nombre")
    private String name;

    @Column(name = "emp_emp")
    private Long idCompany;

    public Long getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(Long idSeason) {
        this.idSeason = idSeason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }
}
