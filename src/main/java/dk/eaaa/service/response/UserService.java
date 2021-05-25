package dk.eaaa.service.response;

import dk.eaaa.domain.Id;
import dk.eaaa.domain.User;
import dk.eaaa.repository.Repository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class UserService {
    private final Repository repository;

    @Inject
    public UserService(Repository repository) {
        this.repository = repository;
    }
    public User getUserById(Id id){
        return repository.getUser(id);
    }
}
