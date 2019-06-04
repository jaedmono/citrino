package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.BpmnResponseDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/process-bpmn"})
public class BpmnController {

    @GetMapping
    public BpmnResponseDTO findBpmn() throws IOException {
        BpmnResponseDTO bpmnResponseDTO = new BpmnResponseDTO();
        File file = new File("C:\\tmp\\tmp.bpmn");
        String str = new String(Files.readAllBytes(file.toPath()), "UTF-8");
        bpmnResponseDTO.setBpmn(str);
        bpmnResponseDTO.setIdCompany(1L);
        bpmnResponseDTO.setIdProcess(1L);
        return bpmnResponseDTO;
    }
}
