package dk.eaaa.service.response;

import dk.eaaa.domain.Id;
import dk.eaaa.domain.User;
import dk.eaaa.repository.Repository;
import dk.eaaa.service.response.request.CreateUserRequest;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.transaction.Transactional;

@Dependent
@Transactional(rollbackOn = Exception.class)
public class UserService {
    private final Repository repository;

    @Inject
    public UserService(Repository repository) {
        this.repository = repository;
    }
    public User getUserById(Id id){
        return repository.getUser(id);
    }

    public void createUser(CreateUserRequest user){repository.CreateUser(user);}
}
