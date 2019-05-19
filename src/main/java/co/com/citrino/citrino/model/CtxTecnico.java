package co.com.citrino.citrino.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ctxsocial", schema = "dbcitrino")
public class CtxTecnico {

    @Id
    @Column(name = "idtecnico")
    private Long idTecnico;

    @Column(name = "variable")
    private String variable;

    @Column(name = "tecnologia")
    private String tecnologia;

    @Column(name = "valor")
    private String valor;

    @Column(name = "emp_emp")
    private Long IdCompany;

    public Long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Long getIdCompany() {
        return IdCompany;
    }

    public void setIdCompany(Long idCompany) {
        IdCompany = idCompany;
    }
}
