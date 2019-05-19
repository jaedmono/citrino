package co.com.citrino.citrino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "industria", schema = "dbcitrino" )
public class Industry {

    @Id
    @Column(name = "ind_ind")
    private Long idInd;

    @Column(name = "ind_nombre")
    private String nameIndustry;

    public Long getIdInd() {
        return idInd;
    }

    public void setIdInd(Long idInd) {
        this.idInd = idInd;
    }

    public String getNameIndustry() {
        return nameIndustry;
    }

    public void setNameIndustry(String nameIndustry) {
        this.nameIndustry = nameIndustry;
    }
}
