package tw.leia.FinalTest.service;

import java.util.List;
import java.util.Optional;

import tw.leia.FinalTest.model.Category;
import tw.leia.FinalTest.model.Product;

public interface CategoryService {
	List<Category> findAllCategory();
	
	Optional<Category> findCategoryById(Integer CategoryId);
	
	Category saveCategory(Category category);
	
	void deleteCategory(Integer CategoryId);

	static Optional<Product> findById(Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
