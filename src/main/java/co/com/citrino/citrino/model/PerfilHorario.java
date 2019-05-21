package co.com.citrino.citrino.model;


import javax.persistence.*;

@Entity
@Table(name = "perfilhorario", schema = "dbcitrino")
public class PerfilHorario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pho_pho")
    private Long idPerfilHorario;

    @Column(name = "pho_temporada")
    private String phoTemporada;

    @Column(name = "pho_tipoempleado")
    private String phoTipoEmpleado;

    @Column(name = "pho_jornada")
    private String phoJornada;

    @Column(name = "pho_extras")
    private String phoExtras;

    @Column(name = "pho_bonos")
    private String phoBonos;

    @Column(name = "pho_otros")
    private String phoOtros;

    @Column(name = "emp_emp")
    private Long idCompany;

    public Long getIdPerfilHorario() {
        return idPerfilHorario;
    }

    public void setIdPerfilHorario(Long idPerfilHorario) {
        this.idPerfilHorario = idPerfilHorario;
    }

    public String getPhoTemporada() {
        return phoTemporada;
    }

    public void setPhoTemporada(String phoTemporada) {
        this.phoTemporada = phoTemporada;
    }

    public String getPhoTipoEmpleado() {
        return phoTipoEmpleado;
    }

    public void setPhoTipoEmpleado(String phoTipoEmpleado) {
        this.phoTipoEmpleado = phoTipoEmpleado;
    }

    public String getPhoJornada() {
        return phoJornada;
    }

    public void setPhoJornada(String phoJornada) {
        this.phoJornada = phoJornada;
    }

    public String getPhoExtras() {
        return phoExtras;
    }

    public void setPhoExtras(String phoExtras) {
        this.phoExtras = phoExtras;
    }

    public String getPhoBonos() {
        return phoBonos;
    }

    public void setPhoBonos(String phoBonos) {
        this.phoBonos = phoBonos;
    }

    public String getPhoOtros() {
        return phoOtros;
    }

    public void setPhoOtros(String phoOtros) {
        this.phoOtros = phoOtros;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }
}
