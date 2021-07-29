package springboot.security.repository;

import springboot.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//CRUD 함수를 JpaRepository가 들고 있으며, @Repository라는 어노테이션이 없어도 IOC 가능
// JpaRepository 를 상속하면 자동 컴포넌트 스캔됨.
public interface UserRepository extends JpaRepository<User, Integer>{

    // Jpa Naming 전략
    // SELECT * FROM user WHERE username = 1?
    User findByUsername(String username);
    // SELECT * FROM user WHERE username = 1? AND password = 2?
    // User findByUsernameAndPassword(String username, String password);

    // @Query(value = "select * from user", nativeQuery = true)
    // User find마음대로();
}