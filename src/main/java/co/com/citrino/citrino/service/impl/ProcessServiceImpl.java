package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.dto.ProcesoResponse;
import co.com.citrino.citrino.model.Process;
import co.com.citrino.citrino.respository.ProcessRepository;
import co.com.citrino.citrino.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.citrino.citrino.model.Process;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private ProcessRepository repository;

    @Override
    public Process create(Process process) {
        return repository.save(process);
    }

    @Override
    public ProcesoResponse create(List<Process> processes) {
        ProcesoResponse response = new ProcesoResponse();
        long countSucess = 0;
        long countErrors = 0;
        for(Process process: processes){
            try {
                repository.save(process);
                countSucess ++;
            }catch (Exception e){
                countErrors ++;
            }
        }
        response.setRecordsError(countErrors);
        response.setRecordsSucess(countSucess);
        return response;
    }

    @Override
    public Process delete(Long id) {
        Process process = new Process();
        process.setId(id);
        repository.delete(process);
        return process;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public Process findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List findByIdIndustry(Long idIndustry) {
        return repository.findByInd(idIndustry);
    }

    @Override
    public Process update(Process process) {
        return null;
    }
}
