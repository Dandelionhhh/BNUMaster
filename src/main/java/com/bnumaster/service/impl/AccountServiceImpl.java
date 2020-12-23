package com.bnumaster.service.impl;


import com.bnumaster.entity.base.Account;
import com.bnumaster.mapper.AccountMapper;
import com.bnumaster.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> getAccountList() {
        return accountMapper.getAccountList();
    }

    @Override
    public void postAccount(Account account) {
        accountMapper.postAccount(account);
    }

    @Override
    public Account getAccount(int id) {
        return accountMapper.getAccount(id);
    }


    @Override
    public void putAccount(Account account) {
        accountMapper.putAccount(account);
    }

    @Override
    public void deleteAccount(int id) {
        accountMapper.deleteAccount(id);
    }

    @Override
    public String findImageById(int id) {
        return accountMapper.findImageById(id);
    }
}
