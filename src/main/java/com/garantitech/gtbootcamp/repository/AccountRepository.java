package com.garantitech.gtbootcamp.repository;

import com.garantitech.gtbootcamp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

    //@Query("select account from Account  account where account.ibanNo  =:ibanNo");
    // List<Account> findByIbanNo(Long ibanNo);


}
