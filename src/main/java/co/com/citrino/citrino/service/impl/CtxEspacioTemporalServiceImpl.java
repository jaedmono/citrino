package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.dto.CtxEspacioTemporalDTO;
import co.com.citrino.citrino.model.Company;
import co.com.citrino.citrino.model.CtxClima;
import co.com.citrino.citrino.model.CtxLocalizacion;
import co.com.citrino.citrino.model.CtxTemporada;
import co.com.citrino.citrino.rest.CtxEspacioTemporal;
import co.com.citrino.citrino.service.CompanyService;
import co.com.citrino.citrino.service.CtxEspacioTemporalService;
import co.com.citrino.citrino.service.CtxLocalizacionService;
import co.com.citrino.citrino.service.CtxTemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CtxEspacioTemporalServiceImpl implements CtxEspacioTemporalService {

    @Autowired
    private CtxClimaServiceImpl ctxClimaService;

    @Autowired
    private CtxLocalizacionService ctxLocalizacionService;

    @Autowired
    private CtxTemporadaService ctxTemporadaService;

    @Autowired
    private CompanyService companyService;

    @Override
    public CtxEspacioTemporal create(CtxEspacioTemporal ctxEspacioTemporal) {
        return null;
    }

    @Override
    public CtxEspacioTemporal delete(Long id) {
        return null;
    }

    @Override
    public List findAll() {
        List<CtxClima> climas = ctxClimaService.findAll();
        List<CtxLocalizacion> localizaciones = ctxLocalizacionService.findAll();
        List<CtxTemporada> temporadas = ctxTemporadaService.findAll();
        List<CtxEspacioTemporalDTO> ctxEspacioTemporalDTOList = new ArrayList<>();
        CtxEspacioTemporalDTO ctxEspacioTemporalDTO;
        Company company;
        for(int i=0 ; i < climas.size(); i++){
            company = companyService.findByIdCompany(localizaciones.get(i).getIdCompany());
            ctxEspacioTemporalDTO = new CtxEspacioTemporalDTO();
            ctxEspacioTemporalDTO.setIdClima(climas.get(i).getIdClima());
            ctxEspacioTemporalDTO.setType(climas.get(i).getType());
            ctxEspacioTemporalDTO.setCity(localizaciones.get(i).getCity());
            ctxEspacioTemporalDTO.setCountry(localizaciones.get(i).getCountry());
            ctxEspacioTemporalDTO.setIdLocalizacion(localizaciones.get(i).getIdLocalizacion());
            ctxEspacioTemporalDTO.setIdCompany(company.getIdCompany());
            ctxEspacioTemporalDTO.setNameCompany(company.getNameCompany());
            if(i<temporadas.size()) {
                ctxEspacioTemporalDTO.setIdSeason(temporadas.get(i).getIdSeason());
                ctxEspacioTemporalDTO.setName(temporadas.get(i).getName());
            }
            ctxEspacioTemporalDTOList.add(ctxEspacioTemporalDTO);
        }

        return ctxEspacioTemporalDTOList;
    }

    @Override
    public CtxEspacioTemporal findById(Long id) {
        return null;
    }

    @Override
    public CtxEspacioTemporal update(CtxEspacioTemporal ctxEspacioTemporal) {
        return null;
    }
}
