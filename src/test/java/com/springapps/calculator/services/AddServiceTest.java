package com.springapps.calculator.services;

import com.springapps.calculator.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddServiceTest {

    @Test
    public void addInteger(){
        //Given
        AddService service = new AddService();

        //When
        Result result = service.add(10,20);

        //then
        Assertions.assertEquals(result.getResult(), 30);

    }

    @Test
    public void addIntegerFail(){
        //Given
        AddService service = new AddService();

        //When
        Result result = service.add(10,10);

        //then
        Assertions.assertEquals(result.getResult(), 30);

    }
}
