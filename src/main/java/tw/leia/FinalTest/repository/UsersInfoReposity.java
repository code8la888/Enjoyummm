package tw.leia.FinalTest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.leia.FinalTest.model.Userinfo;
import tw.leia.FinalTest.model.Users;


public interface UsersInfoReposity extends JpaRepository<Userinfo, Long>{
	
	Optional<Userinfo> findByUsers(Users users);

}
