package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SubOperationTest {
    @Test
    public void SubPositiveToPositiveTest() {

        Operation operation = new SubOperation(5, 3);
        double result = operation.perform(); //2.0
        assertThat(result, is(2.0));

    }

    @Test
    public void SubPositiveToZeroTest(){
        Operation operation = new SubOperation(3, 0);
        double result = operation.perform(); //3.0
        assertThat(result, is(3.0));
    }

    @Test
    public void SubZeroToPositiveTest(){
        Operation operation = new SubOperation(0, 3);
        double result = operation.perform(); //3.0
        assertThat(result, is(-3.0));
    }

    @Test
    public void SubPositiveToNegativeTest(){
        Operation operation = new SubOperation(5, -3);
        double result = operation.perform(); //8.0
        assertThat(result, is(8.0));
    }

    @Test
    public void SubNegativeToPositiveTest(){
        Operation operation = new SubOperation(-3, 5);
        double result = operation.perform(); //-8.0
        assertThat(result, is(8.0));
    }
    @Test
    public void SubNegativeToNegativeTest(){
        Operation operation = new SubOperation(-3, -5);
        double result = operation.perform(); //2.0
        assertThat(result, is(2.0));
    }
    @Test
    public void SubNegativeToZeroTest(){
        Operation operation=new AddOperation(-2,0);
        double result = operation.perform(); //-2.0
        assertThat(result, is(-2.0));

    }
    @Test
    public void SubZeroToNegativeTest(){
        Operation operation=new AddOperation(0,-8);
        double result = operation.perform(); //5.0
        assertThat(result, is(8.0));

    }


}

