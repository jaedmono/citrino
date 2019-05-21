package co.com.citrino.citrino.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "perfilpoliticas", schema = "dbcitrino")
public class PerfilPoliticas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ppol_ppol")
    private Long idPerfilPoliticas;

    @Column(name = "emp_emp")
    private Long idCompany;

    @Column(name = "ppol_variable")
    private String ppolVariable;

    @Column(name = "ppol_descripcion")
    private String ppolDescripcion;

    @Column(name = "ppol_valor")
    private String ppolValor;

    @Column(name = "ppol_tipodato")
    private String ppolTipoDato;

    @Column(name = "ppol_tipo_cadena")
    private String ppolTipoCadena;

    @Column(name = "ppol_tipo_entero")
    private Long ppolTipoEntero;

    @Column(name = "ppol_tipo_boolenano")
    private Long ppolTipoBooleano;

    @Column(name = "ppol_tipo_fecha")
    private Date ppolTipoFecha;

    public Long getIdPerfilPoliticas() {
        return idPerfilPoliticas;
    }

    public void setIdPerfilPoliticas(Long idPerfilPoliticas) {
        this.idPerfilPoliticas = idPerfilPoliticas;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public String getPpolVariable() {
        return ppolVariable;
    }

    public void setPpolVariable(String ppolVariable) {
        this.ppolVariable = ppolVariable;
    }

    public String getPpolDescripcion() {
        return ppolDescripcion;
    }

    public void setPpolDescripcion(String ppolDescripcion) {
        this.ppolDescripcion = ppolDescripcion;
    }

    public String getPpolValor() {
        return ppolValor;
    }

    public void setPpolValor(String ppolValor) {
        this.ppolValor = ppolValor;
    }

    public String getPpolTipoDato() {
        return ppolTipoDato;
    }

    public void setPpolTipoDato(String ppolTipoDato) {
        this.ppolTipoDato = ppolTipoDato;
    }

    public String getPpolTipoCadena() {
        return ppolTipoCadena;
    }

    public void setPpolTipoCadena(String ppolTipoCadena) {
        this.ppolTipoCadena = ppolTipoCadena;
    }

    public Long getPpolTipoEntero() {
        return ppolTipoEntero;
    }

    public void setPpolTipoEntero(Long ppolTipoEntero) {
        this.ppolTipoEntero = ppolTipoEntero;
    }

    public Long getPpolTipoBooleano() {
        return ppolTipoBooleano;
    }

    public void setPpolTipoBooleano(Long ppolTipoBooleano) {
        this.ppolTipoBooleano = ppolTipoBooleano;
    }

    public Date getPpolTipoFecha() {
        return ppolTipoFecha;
    }

    public void setPpolTipoFecha(Date ppolTipoFecha) {
        this.ppolTipoFecha = ppolTipoFecha;
    }
}
