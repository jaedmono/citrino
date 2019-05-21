package co.com.citrino.citrino.model;

import javax.persistence.*;

@Entity
@Table(name = "proceso", schema = "dbcitrino" )
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "idproceso")
    private String idProcess;

    @Column(name = "pcf")
    private Long pcf;

    @Column(name = "nombre")
    private String processDescription;

    @Column(name = "ind_ind")
    private Long ind;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdProcess() {
        return idProcess;
    }

    public void setIdProcess(String idProcess) {
        this.idProcess = idProcess;
    }

    public Long getPcf() {
        return pcf;
    }

    public void setPcf(Long pcf) {
        this.pcf = pcf;
    }

    public String getProcessDescription() {
        return processDescription;
    }

    public void setProcessDescription(String processDescription) {
        this.processDescription = processDescription;
    }

    public Long getInd() {
        return ind;
    }

    public void setInd(Long ind) {
        this.ind = ind;
    }
}
