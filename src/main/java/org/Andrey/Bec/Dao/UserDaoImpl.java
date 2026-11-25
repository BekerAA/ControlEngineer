package org.Andrey.Bec.Dao;

import org.Andrey.Bec.Model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(Long id, User newUser) {
        User user = findById(id);
        if (user != null){
            user.setName(newUser.getName());
            user.setLastName(newUser.getLastName());
            user.setEmail(newUser.getEmail());
            user.setRole(newUser.getRole());
        }
    }

    @Override
    public void delete(Long id) {
        User user = entityManager.find(User.class, id);
        if (user != null){
            entityManager.remove(user);
        }

    }

    @Override
    public User findById(Long id) {
        User user = entityManager.find(User.class, id);
        return user;

    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
}
