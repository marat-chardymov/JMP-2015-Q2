package com.example.dao.impl;

import com.example.dao.UserGroupDao;
import com.example.model.UserGroup;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Razor on 7/12/2015.
 */
@Repository
@Transactional
public class UserGroupDaoImpl implements UserGroupDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(UserGroup userGroup) {
        entityManager.merge(userGroup);
    }

    public UserGroup read(int id){
        return entityManager.find(UserGroup.class, id);
    }
}
