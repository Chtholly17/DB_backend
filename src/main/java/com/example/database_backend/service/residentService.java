package com.example.database_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.database_backend.database.mapper.ResidentMapper;

@Service
public class residentService {
    @Autowired
    private ResidentMapper ResidentMapper;

    /**
     * login
     * code: 0 -> success
     * code: 1 -> wrong password
     * code: 2 -> no such user
     * @param number: resident number
     * @param password: resident password
     * @return code
     */

    public Integer login(String number, String password) {
        String passwordFromDatabase = ResidentMapper.selectPasswordByNumber(number);
        if (passwordFromDatabase == null) {
            return 2;
        } else if (passwordFromDatabase.equals(password)) {
            return 0;
        } else {
            return 1;
        }
    }
}
