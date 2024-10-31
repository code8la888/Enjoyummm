package tw.leia.FinalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.leia.FinalTest.model.Category;
import tw.leia.FinalTest.model.Product;

import java.util.List;


public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
