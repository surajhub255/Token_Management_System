package blackcoffer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import blackcoffer.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
