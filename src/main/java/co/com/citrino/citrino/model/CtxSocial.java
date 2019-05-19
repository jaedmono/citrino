package co.com.citrino.citrino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ctxsocial", schema = "dbcitrino")
public class CtxSocial {

    @Id
    @Column(name = "idsocial")
    private Long idSocial;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "implicacion")
    private String implicacion;

    @Column(name = "valor")
    private Long valor;

    @Column(name = "emp_emp")
    private Long idCompany;

    public Long getIdSocial() {
        return idSocial;
    }

    public void setIdSocial(Long idSocial) {
        this.idSocial = idSocial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImplicacion() {
        return implicacion;
    }

    public void setImplicacion(String implicacion) {
        this.implicacion = implicacion;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }
}
