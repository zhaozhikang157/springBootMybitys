package com.service.impl;

import com.mapper.LoginMapper;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String login(String name,String pwd) {
        return loginMapper.login(name,pwd);
    }
}
