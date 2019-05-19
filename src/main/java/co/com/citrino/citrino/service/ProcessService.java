package co.com.citrino.citrino.service;

import java.util.List;
import co.com.citrino.citrino.model.Process;

public interface ProcessService {

    Process create(Process Process) ;

    Process delete(Long id) ;

    List findAll() ;

    Process findById(Long id) ;

    Process update(Process process) ;
}
