package org.geektimes.projects.user.service.impl;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean register(User user) {
        DatabaseUserRepository repository = new DatabaseUserRepository();
        try {
            return repository.save(user);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        } finally {
            repository.releaseConnection();
        }
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }
}
