package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.PerfilMetodoPago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfilMetodoPagoRepository extends JpaRepository<PerfilMetodoPago, Double> {

    void delete(PerfilMetodoPago user);

    List findAll();

    PerfilMetodoPago save(PerfilMetodoPago user);

    PerfilMetodoPago findByIdPerfilMetodoPago(Long idProfile);
}
