package com.profullstack.springseed.sample.domain.components.repository;

import com.profullstack.springseed.sample.domain.components.model.User;

import java.util.List;

/**
 * Created by christianxiao on 6/25/17.
 */
public interface UserRepositoryCustom {

    List<User> findUserByLoginIdAndPassword2(String id, String password);
}
