package com.bnumaster.controller;

import com.bnumaster.common.tools.utils.QiniuCloudUtils;
import com.bnumaster.entity.base.Account;
import com.bnumaster.entity.params.AccountParams;
import com.bnumaster.service.IAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    private QiniuCloudUtils qiniuCloudUtils = new QiniuCloudUtils();

    @GetMapping("/getAccountList")
    @ApiOperation(value = "获取用户列表")
    public List<Account> getAccountList(){
        List<Account> accounts = accountService.getAccountList();
        return accounts;
    }

    @PostMapping("/postAccount")
    @ApiOperation(value = "创建用户", notes = "根据Account对象创建用户")
    public String postAccount(AccountParams params,
                              @RequestPart @RequestParam(value = "avator") MultipartFile file){
        Account account = new Account();
        account.setNickName(params.getNickName());
        account.setRole(1);
        account.setPhone(params.getPhone());
        account.setPhoneValidated(params.getPhoneValidated());
        account.setPassWord(params.getPassWord());
        account.setCleanPassWord(params.getCleanPassWord());
        account.setEmail(params.getEmail());
        account.setEmailValidated(params.getEmailValidated());
        account.setUserName(params.getUserName());
        account.setModified(params.getModified());
        account.setMotto(params.getMotto());
        account.setAddressId(params.getAddressId());
        account.setRealName(params.getRealName());
        account.setIdCode(params.getIdCode());
        account.setOptions(params.getOptions());
        account.setCreateTime(params.getCreateTime());
        account.setUpdateTime(params.getUpdateTime());
        account.setParentId(params.getParentId());
        if(!file.isEmpty()){
            System.out.println(file.getOriginalFilename());
            try{
                String url = qiniuCloudUtils.uploadToQiniu(file);
                account.setAvator(url);
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            account.setAvator(null);
        }
        accountService.postAccount(account);
        return "success";
    }

    @GetMapping("/getAccount/{id}")
    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    public Account getAccount(@PathVariable int id){return accountService.getAccount(id);}

    @PutMapping("/putAccount")
    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的account信息来更新用户详细信息")
    public String putAccount(@Validated AccountParams params,
                             @RequestPart @RequestParam(value = "avator") MultipartFile file){
        int id = params.getId();
        Account account = accountService.getAccount(id);
        account.setNickName(params.getNickName());
        account.setRole(1);
        account.setPhone(params.getPhone());
        account.setPhoneValidated(params.getPhoneValidated());
        account.setPassWord(params.getPassWord());
        account.setCleanPassWord(params.getCleanPassWord());
        account.setEmail(params.getEmail());
        account.setEmailValidated(params.getEmailValidated());
        account.setUserName(params.getUserName());
        account.setModified(params.getModified());
        account.setMotto(params.getMotto());
        account.setAddressId(params.getAddressId());
        account.setRealName(params.getRealName());
        account.setIdCode(params.getIdCode());
        account.setOptions(params.getOptions());
        account.setCreateTime(params.getCreateTime());
        account.setUpdateTime(params.getUpdateTime());
        account.setParentId(params.getParentId());

        if(!file.isEmpty()){
            System.out.println(file.getOriginalFilename());
            try{
                String url = qiniuCloudUtils.uploadToQiniu(file);
                String oldurl = accountService.findImageById(id);
                int statusCode = qiniuCloudUtils.deleteFromQiniu(oldurl);
                if(statusCode == -1){
                    System.out.println("图片删除失败");
                }else{
                    System.out.println("图片删除成功");
                }
                account.setAvator(url);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
       accountService.putAccount(account);
        return "success";
    }

    @DeleteMapping("/deleteAccount/{id}")
    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    public String deleteAccount(@PathVariable int id){
        String oldUrl = accountService.findImageById(id);
        int statusCode = qiniuCloudUtils.deleteFromQiniu(oldUrl);
        if(statusCode == -1){
            System.out.println("图片删除失败！");
        }else{
            System.out.println("图片删除成功！");
        }
        accountService.deleteAccount(id);
        return "success";
    }
}
