package com.bnumaster.service;

import com.bnumaster.entity.base.Account;

import java.util.List;

public interface IAccountService {
    //获取用户列表
    public List<Account> getAccountList();

    //增加用户
    public void postAccount(Account account);

    //获取用户详细信息
    public Account getAccount(int id);

    //更新用户
    public void putAccount(Account account);

    //根据id删除用户
    public void deleteAccount(int id);

    //根据id查找用户头像
    public String findImageById(int id);
}
