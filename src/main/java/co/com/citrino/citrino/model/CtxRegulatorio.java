package co.com.citrino.citrino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ctxregulatorio", schema = "dbcitrino")
public class CtxRegulatorio {

    @Id
    @Column(name = "idregulatorio")
    private Long idRegulatorio;

    @Column(name = "norma")
    private String norma;

    @Column(name = "item")
    private String item;

    @Column(name = "implicación")
    private String implicacion;

    @Column(name = "valor")
    private String valor;

    @Column(name = "emp_emp")
    private Long idCompany;

    public Long getIdRegulatorio() {
        return idRegulatorio;
    }

    public void setIdRegulatorio(Long idRegulatorio) {
        this.idRegulatorio = idRegulatorio;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getImplicacion() {
        return implicacion;
    }

    public void setImplicacion(String implicacion) {
        this.implicacion = implicacion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }
}
