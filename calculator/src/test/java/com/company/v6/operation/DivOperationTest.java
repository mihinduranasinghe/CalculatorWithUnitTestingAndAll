package com.company.v6.operation;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class DivOperationTest {
    @Test
    public void DivPositiveToPositive(){
        Operation operation=new DivOperation(7,2);
        double result = operation.perform();
        assertThat(result, is(3.5));
    }
    @Test
    public void MulPositiveToZeroTest(){
        Operation operation = new DivOperation(3, 0);
        double result = operation.perform(); //3.0
        assertThat(result, is(5));//Infinity
    }

    @Test
    public void MulZeroToPositiveTest(){
        Operation operation = new DivOperation(0, 3);
        double result = operation.perform(); //3.0
        assertThat(result, is(0.0));
    }

    @Test
    public void MulPositiveToNegativeTest(){
        Operation operation = new DivOperation(15, -3);
        double result = operation.perform(); //-5.0
        assertThat(result, is(-5.0));
    }

    @Test
    public void MulNegativeToPositiveTest(){
        Operation operation = new DivOperation(-23, 5);
        double result = operation.perform(); //-8.0
        assertThat(result, is(-4.6));
    }
    @Test
    public void MulNegativeToNegativeTest(){
        Operation operation = new DivOperation(-15, -5);
        double result = operation.perform(); //3.0
        assertThat(result, is(3.0));
    }
    @Test
    public void MulNegativeToZeroTest(){
        Operation operation=new DivOperation(-2,0);
        double result = operation.perform(); //0.0
        assertThat(result, is(0.0));//Infinity

    }
    @Test
    public void MulZeroToNegativeTest(){
        Operation operation=new DivOperation(0,-8);
        double result = operation.perform(); //0.0
        assertThat(result, is(-0.0));

    }



}