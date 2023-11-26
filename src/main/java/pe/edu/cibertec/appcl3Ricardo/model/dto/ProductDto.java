package pe.edu.cibertec.appcl3Ricardo.model.dto;

import lombok.Data;

@Data
public class ProductDto implements DtoEntity {
    private Integer productid;
    private String productname;
    private String quantityperunit;
    private Double unitprice;
    private CategoryDto category;
    private SupplierDto supplier;
}
