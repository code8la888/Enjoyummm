package tw.leia.FinalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tw.leia.FinalTest.dto.orders.MerchantByUserDto;
import tw.leia.FinalTest.model.Cart;
import tw.leia.FinalTest.model.Payment;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    @Query(value = "SELECT p.merchantNo FROM Payment p JOIN orders o ON p.orderId = o.orderId JOIN users u ON o.userId = u.userId WHERE u.userId = :userId AND DATE(o.orderDate) >= CURDATE();",
            nativeQuery = true)

    List<String> findMerchantNoByUsersUserId(Long userId);
}
