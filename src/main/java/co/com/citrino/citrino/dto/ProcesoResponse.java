package co.com.citrino.citrino.dto;

public class ProcesoResponse {
    private Long recordsSucess;
    private Long recordsError;

    public Long getRecordsSucess() {
        return recordsSucess;
    }

    public void setRecordsSucess(Long recordsSucess) {
        this.recordsSucess = recordsSucess;
    }

    public Long getRecordsError() {
        return recordsError;
    }

    public void setRecordsError(Long recordsError) {
        this.recordsError = recordsError;
    }
}
