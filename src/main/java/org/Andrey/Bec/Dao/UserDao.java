package org.Andrey.Bec.Dao;

import org.Andrey.Bec.Model.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    void update(Long id ,User newUser);

    void delete(Long id);

    User findById(Long id);

    List<User> findAll();

}
