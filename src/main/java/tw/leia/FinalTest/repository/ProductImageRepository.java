package tw.leia.FinalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.leia.FinalTest.model.ProductImage;

import java.util.List;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
    List<ProductImage> findByProductProductId(Integer productId);
}
