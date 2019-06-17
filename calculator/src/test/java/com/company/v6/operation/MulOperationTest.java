package com.company.v6.operation;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


public class MulOperationTest {
    @Test
        public void MulPositiveToPositiveTest(){
        Operation operation=new MulOperation(5,3);
        double result = operation.perform();
        assertThat(result, is(15.0));
    }
    @Test
    public void MulPositiveToZeroTest(){
        Operation operation = new MulOperation(3, 0);
        double result = operation.perform(); //3.0
        assertThat(result, is(0.0));
    }

    @Test
    public void MulZeroToPositiveTest(){
        Operation operation = new MulOperation(0, 3);
        double result = operation.perform(); //3.0
        assertThat(result, is(0.0));
    }

    @Test
    public void MulPositiveToNegativeTest(){
        Operation operation = new MulOperation(5, -3);
        double result = operation.perform(); //-15.0
        assertThat(result, is(-15.0));
    }

    @Test
    public void MulNegativeToPositiveTest(){
        Operation operation = new MulOperation(-3, 5);
        double result = operation.perform(); //-15.0
        assertThat(result, is(-15.0));
    }
    @Test
    public void MulNegativeToNegativeTest(){
        Operation operation = new MulOperation(-3, -5);
        double result = operation.perform(); //15.0
        assertThat(result, is(15.0));
    }
    @Test
    public void MulNegativeToZeroTest(){
        Operation operation=new MulOperation(-2,0);
        double result = operation.perform(); //0.0
        assertThat(result, is(0.0));

    }
    @Test
    public void MulZeroToNegativeTest(){
        Operation operation=new MulOperation(0,-8);
        double result = operation.perform(); //0.0
        assertThat(result, is(0.0));

    }


}