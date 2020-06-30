package ru.vechkanov.lesson8.task1;

import java.math.BigDecimal;


public class Calc {

    static public BigDecimal plus(String firstValue, String secondValue) {
        return new BigDecimal(firstValue).add(new BigDecimal(secondValue));}

    static public BigDecimal minus (String firstValue, String secondValue){
        return new BigDecimal(firstValue).subtract(new BigDecimal(secondValue));}

     static public BigDecimal umnojenie (String firstValue, String secondValue){
        return new BigDecimal(firstValue).multiply(new BigDecimal(secondValue));}

    static public BigDecimal delenie (String firstValue, String secondValue){
        return new BigDecimal(firstValue).divide(new BigDecimal(secondValue));}


    static public BigDecimal procent (String firstValue, String secondValue){
        return (new BigDecimal(100)).divide(new BigDecimal(secondValue));}

                }

