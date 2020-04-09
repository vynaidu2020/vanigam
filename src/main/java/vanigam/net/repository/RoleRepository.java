package vanigam.net.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import vanigam.net.domain.Role;

/** Created by vyn on 09-Apr-2020 */

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);
}
