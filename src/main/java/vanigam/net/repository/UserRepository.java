package vanigam.net.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import vanigam.net.domain.User;

/** Created by vyn on 09-Apr-2020 */
public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}
