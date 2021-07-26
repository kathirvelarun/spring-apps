package com.springapps.calculator;

import com.springapps.calculator.model.Result;
import com.springapps.calculator.services.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("add")
public class AddController {

    @Autowired
    private AddService addService;

    @GetMapping
    public Result add(@RequestParam int a, @RequestParam int b){
        return addService.add(a,b);
    }
}
