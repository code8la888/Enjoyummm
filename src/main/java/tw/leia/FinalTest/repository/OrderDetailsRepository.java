package tw.leia.FinalTest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.leia.FinalTest.model.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
	
	List<OrderDetails> findByOrdersOrderId(Integer orderId);
	
}
