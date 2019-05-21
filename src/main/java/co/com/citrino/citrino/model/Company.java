package co.com.citrino.citrino.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "empresa", schema = "dbcitrino" )
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_emp")
    private Long idCompany;

    @Column(name = "emp_nit")
    private Long nitCompany;

    @Column(name = "emp_nombre")
    private String nameCompany;

    @Column(name = "emp_tipoempresa")
    private String companyType;

    @Column(name = "emp_acteconomia")
    private String acteconomia;

    @Column(name = "emp_fjuridica")
    private String fjuridica;

    @Column(name = "emp_ambitooper")
    private String ambitooper;


    @Column(name = "emp_estado")
    private String stateCompany;

    @Column(name = "emp_fechacreacion")
    private Date creationDate;

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public Long getNitCompany() {
        return nitCompany;
    }

    public void setNitCompany(Long nitCompany) {
        this.nitCompany = nitCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getActeconomia() {
        return acteconomia;
    }

    public void setActeconomia(String acteconomia) {
        this.acteconomia = acteconomia;
    }

    public String getFjuridica() {
        return fjuridica;
    }

    public void setFjuridica(String fjuridica) {
        this.fjuridica = fjuridica;
    }

    public String getAmbitooper() {
        return ambitooper;
    }

    public void setAmbitooper(String ambitooper) {
        this.ambitooper = ambitooper;
    }

    public String getStateCompany() {
        return stateCompany;
    }

    public void setStateCompany(String stateCompany) {
        this.stateCompany = stateCompany;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
