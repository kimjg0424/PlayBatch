package com.example.springbatchtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class codingtest {
public int solution(int n) {
        int answer = 0;
        if(n % 2 ==0) answer = 2;
        else answer = 1;
        return answer;
    }
}