package com.garantitech.gtbootcamp.service.entityService;

import com.garantitech.gtbootcamp.entity.Account;
import com.garantitech.gtbootcamp.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountEntityService {

    private AccountRepository accountRepository;
    public  AccountEntityService(AccountRepository accountRepository){

        this.accountRepository=accountRepository;                 //injection
    }
    public Account save(Account account){
        account=accountRepository.save(account);
        return account;
    }
    public Account findById(Long id){
        Optional<Account> accountOptional=accountRepository.findById(id);
        return  accountOptional.get();
    }

}
