package pe.edu.cibertec.appcl3Ricardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appcl3Ricardo.model.bd.Category;

import java.util.List;
import java.util.Optional;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Optional<Category> findByCategoryname(String categoryName);

    List<Category> findByCategorynameContainingIgnoreCase(String filtro);

    @Query("SELECT c FROM Category c WHERE c.categoryname LIKE %:filtro%")
    List<Category> filtrarCategoriasPorNombre(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM categories WHERE categoryname LIKE %:filtro%",
    nativeQuery = true)
    List<Category> filtrarCategoriasPorNombreSQL(@Param("filtro") String filtro);




}
