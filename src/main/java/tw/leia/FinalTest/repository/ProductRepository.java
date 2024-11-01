package tw.leia.FinalTest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.leia.FinalTest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByCategoryCategoryId(Integer categoryId);

	List<Product> findByPriceBetween(Integer minPrice, Integer maxPrice);
	
	// 查詢根據產品類型和分類
    List<Product> findByTypeAndCategory_CategoryId(String type, Integer categoryId);

    List<Product> findByPriceGreaterThanEqual(double minPrice);

    List<Product> findByPriceLessThanEqual(double maxPrice);

	//模糊查詢
    List<Product> findByNameContaining(String keyword);

    Product findProductByName(String keyword);
    
    List<Product> findByType(String type);


}