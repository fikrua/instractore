package instructoredemo.instrademo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByFirstName(String firstName);

    Long countByEmail(String email);
    long countByUsername(String username);

}
