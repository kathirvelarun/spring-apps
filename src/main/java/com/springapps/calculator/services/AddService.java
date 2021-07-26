package com.springapps.calculator.services;

import com.springapps.calculator.model.Result;
import org.springframework.stereotype.Service;

@Service
public class AddService {

        public Result add(int a, int b) {
            int sum = a + b;
            return new Result(sum);
        }
}
