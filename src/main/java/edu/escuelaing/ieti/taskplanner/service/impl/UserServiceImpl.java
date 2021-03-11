package edu.escuelaing.ieti.taskplanner.service.impl;

import edu.escuelaing.ieti.taskplanner.model.User;
import edu.escuelaing.ieti.taskplanner.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> usuarios = new ArrayList<User>();

    @Override
    public List<User> getAll() {
        usuarios.clear();
        this.create(new User("Juan","juan@mail.com","juanPassword"));
        this.create(new User("Carlos","carlos@mail.com","carlosPassword"));
        this.create(new User("Valentina","valentina@mail.com","valentinaPassword"));
        this.create(new User("Katherine","katherine@mail.com","khaterinePassword"));
        this.create(new User("Nicolas","nicolas@mail.com","nicolasPassword"));
        return usuarios;
    }

    @Override
    public User getById(String userId) {
        return null;
    }

    @Override
    public User create(User user) {
        usuarios.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void remove(String userId) {

    }
}
