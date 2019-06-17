package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AddOperationTest {
    @Test
    public void AddPositiveToPositiveTest(){
        Operation operation=new AddOperation(2,3);
        double result = operation.perform(); //5.0
        assertThat(result, is(5.0));

        }

    @Test
    public void AddPositiveToZeroTest(){
        Operation operation=new AddOperation(2,0);
        double result = operation.perform(); //5.0
        assertThat(result, is(2.0));

    }
    @Test
    public void AddZeroToPositiveTest(){
        Operation operation=new AddOperation(0,5);
        double result = operation.perform(); //5.0
        assertThat(result, is(5.0));

    }
    @Test
    public void AddPositiveToNegativeTest(){
        Operation operation=new AddOperation(2,-5);
        double result = operation.perform(); //-3.0
        assertThat(result, is(-3.0));

    }
    @Test
    public void AddNegativeToPositiveTest(){
        Operation operation=new AddOperation(-2,5);
        double result = operation.perform(); //3.0
        assertThat(result, is(3.0));

    }
    @Test
    public void AddNegativeToNegativeTest(){
        Operation operation=new AddOperation(-2,-5);
        double result = operation.perform(); //-7.0
        assertThat(result, is(-7.0));

    }
    @Test
    public void AddNegativeToZeroTest(){
        Operation operation=new AddOperation(-2,0);
        double result = operation.perform(); //-2.0
        assertThat(result, is(-2.0));

    }
    @Test
    public void AddZeroToNegativeTest(){
        Operation operation=new AddOperation(0,-5);
        double result = operation.perform(); //-5.0
        assertThat(result, is(-5.0));

    }
    }
