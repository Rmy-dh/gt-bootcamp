package com.garantitech.gtbootcamp.controller;

import com.garantitech.gtbootcamp.entity.Account;
import com.garantitech.gtbootcamp.enums.PriceType;
import com.garantitech.gtbootcamp.service.entityService.AccountEntityService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/accounts")                      //path
public class AccountController {
    private AccountEntityService accountEntityService;              //Constuctur injection

    public AccountController(AccountEntityService accountEntityService){
        this.accountEntityService=accountEntityService;


    }

    @PostMapping
    public Account save(Account account){                        //save the account to the table
        account=accountEntityService.save(account);

        return account;
    }



    @DeleteMapping("/{id}")
    public void deleteAccountById(@PathVariable Long id){             //delete account by id number
        System.out.println("Account deleted. id: "+id);

    }
    @GetMapping("/depository")
    public Double depositMoney(Account account){                      //give the CurrentBalance
        return account.getCurrentBalance();
    }
    @GetMapping("/drawMoney")
    public PriceType withDrawMoney(Account account){                //give PriceType
        return account.priceType;

    }
     /*

    @GetMapping("/{id}")
    public Account getAccountById(){
        Account account=new Account();
        account.setId(1L);                                        //for test
        account.setIbanNo(123L);
        account.setPriceType(PriceType.DOLAR);
        account.setAccaountType(AccountType.DEPOSIT);
        account.setCurrentBalance(12.1);

        return account;

    }
    */
    /*
    @GetMapping("/accountByCustomer")
    public  Account findAllAccountsByCustomerId(@PathVariable Long id){

                :(
    }

     */




}

