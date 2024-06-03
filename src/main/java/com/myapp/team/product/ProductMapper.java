package com.myapp.team.product;

import com.myapp.team.option.Option;
import org.apache.ibatis.annotations.*;

import java.util.List;
// repository는 JPA

@Mapper
public interface ProductMapper {

    List<Product> findAllProducts();

    Product findProductById(int productNo);

    void insertProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(int productNo);

    // 옵션 부분
    void insertOption(Option option);

    void deleteOptions(int productNo);


//    List<Product> selectProductsByCategory(@Param("categoryName") String categoryName);

}
