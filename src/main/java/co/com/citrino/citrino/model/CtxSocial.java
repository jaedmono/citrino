package co.com.citrino.citrino.model;

import javax.persistence.*;

@Entity
@Table(name = "ctxsocial", schema = "dbcitrino")
public class CtxSocial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsocial")
    private Long idSocial;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "implicacion")
    private String implicacion;

    @Column(name = "valor")
    private String valor;

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
