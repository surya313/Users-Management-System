package user.springboot.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import user.springboot.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {

	

	@Query("SELECT u from Users u where u.id= :id")
	Users findUserById(@Param("id")Integer id);

	

	

}
