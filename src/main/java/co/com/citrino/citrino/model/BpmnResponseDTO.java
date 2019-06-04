package co.com.citrino.citrino.model;

public class BpmnResponseDTO {
    private Long idCompany;
    private Long idProcess;
    private String bpmn;

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public Long getIdProcess() {
        return idProcess;
    }

    public void setIdProcess(Long idProcess) {
        this.idProcess = idProcess;
    }

    public String getBpmn() {
        return bpmn;
    }

    public void setBpmn(String bpmn) {
        this.bpmn = bpmn;
    }
}
