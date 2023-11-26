package pe.edu.cibertec.appcl3Ricardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appcl3Ricardo.model.bd.Usuario;

@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer> {

    Usuario findByNomusuario(String nomusuario);

}
