package com.ltchu.repository;

import com.ltchu.model.LoginAccount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LoginAccountRepository extends CrudRepository<LoginAccount, String> {

    @Query(value = "select o from LoginAccount o where o.account=?1")
    LoginAccount findByAccount(String account);
}
