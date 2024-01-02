package blackcoffer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import blackcoffer.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
