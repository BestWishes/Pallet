package ljj.sssp.pallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ljj.sssp.pallet.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
