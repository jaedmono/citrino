package co.com.citrino.citrino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfilmetodopago", schema = "dbcitrino")
public class PerfilMetodoPago {

    @Id
    @Column(name = "pmp_pmp")
    private Long idPerfilMetodoPago;

    @Column(name = "pmp_destinopago")
    private String pmpDestinoPago;

    @Column(name = "pmp_mediopago")
    private String pmpMedioPago;

    @Column(name = "pmp_estado")
    private String pmpEstado;

    @Column(name = "emp_emp")
    private Long idCompany;

    public Long getIdPerfilMetodoPago() {
        return idPerfilMetodoPago;
    }

    public void setIdPerfilMetodoPago(Long idPerfilMetodoPago) {
        this.idPerfilMetodoPago = idPerfilMetodoPago;
    }

    public String getPmpDestinoPago() {
        return pmpDestinoPago;
    }

    public void setPmpDestinoPago(String pmpDestinoPago) {
        this.pmpDestinoPago = pmpDestinoPago;
    }

    public String getPmpMedioPago() {
        return pmpMedioPago;
    }

    public void setPmpMedioPago(String pmpMedioPago) {
        this.pmpMedioPago = pmpMedioPago;
    }

    public String getPmpEstado() {
        return pmpEstado;
    }

    public void setPmpEstado(String pmpEstado) {
        this.pmpEstado = pmpEstado;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }
}
