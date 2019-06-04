package co.com.citrino.citrino.service;

import java.util.List;

import co.com.citrino.citrino.dto.ProcesoResponse;
import co.com.citrino.citrino.model.Process;

public interface ProcessService {

    Process create(Process Process) ;

    ProcesoResponse create(List<Process> Process) ;

    Process delete(Long id) ;

    List findAll() ;

    List findByIdIndustry(Long idIndustry);

    Process findById(Long id) ;

    Process update(Process process) ;
}
