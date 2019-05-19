package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Double> {

    void delete(Company company);

    List findAll();

    Company save(Company company);

    Company findByIdCompany(Long idCompany);
}
