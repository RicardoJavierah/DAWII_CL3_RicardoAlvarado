package pe.edu.cibertec.appcl3Ricardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appcl3Ricardo.model.bd.Supplier;

@Repository
public interface SupplierRepository
        extends JpaRepository<Supplier, Integer>
{
}
