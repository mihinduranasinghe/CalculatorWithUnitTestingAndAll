package com.company.v6;


import com.company.v6.repository.FIleNumberRepository;
import com.company.v6.repository.NumberRepository;


public class Main {

    public static void main(String args[]){
        NumberRepository numberRepository=new FIleNumberRepository();
        CalculatorApp calculatorApp=new CalculatorApp(numberRepository.args);
        calculatorApp.run();  }

}
