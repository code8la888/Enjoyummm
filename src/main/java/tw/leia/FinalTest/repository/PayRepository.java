package tw.leia.FinalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.leia.FinalTest.model.Pay;

public interface PayRepository extends JpaRepository<Pay, Long> {
}
