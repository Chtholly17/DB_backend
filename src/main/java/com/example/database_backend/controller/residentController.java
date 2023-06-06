package com.example.database_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.database_backend.service.residentService;
import com.example.database_backend.util.Result;

@RestController
public class residentController {
    @Autowired
    private residentService residentService;

    /**
     * login
     * code: 0 -> success
     * code: 1 -> wrong password
     * code: 2 -> no such user
     * @param number: resident number
     * @param password: resident password
     * @return Result
     */
    @PostMapping("/login")
    public Result login(String number, String password) {
        Integer code = residentService.login(number, password);
        if (code == 0) {
            return Result.success();
        } else if (code == 1) {
            return Result.fail("wrong password");
        } else {
            return Result.fail("no such user");
        }
    }
}
