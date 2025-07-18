package com.example.demo; // 본인의 패키지명에 맞게 수정해주세요.

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}