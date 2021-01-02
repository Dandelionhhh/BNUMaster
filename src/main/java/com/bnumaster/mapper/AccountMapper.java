package com.bnumaster.mapper;

import com.bnumaster.entity.base.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface AccountMapper {
    //查询全部用户
    List<Account> getAccountList();

    //增加用户
    void postAccount(Account account);

    //根据id获取用户
    Account getAccount(int id);

    //修改
    void putAccount(Account account);

    //删除
    void deleteAccount(int id);

    //查找
    String findImageById(int id);
}
