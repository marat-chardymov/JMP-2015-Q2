package com.example.dao.impl;

import com.example.dao.UserDao;
import com.example.model.AbstractUser;
import com.example.model.PowerUser;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Razor on 7/10/2015.
 */
@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(AbstractUser user) {
        entityManager.persist(user);
    }

    public AbstractUser read(int id) {
        return entityManager.find(AbstractUser.class, id);
    }

    public List<PowerUser> findPowerUsers() {
        Query query = entityManager.createQuery("SELECT p FROM PowerUser p");
        return (List<PowerUser>) query.getResultList();
    }
}
