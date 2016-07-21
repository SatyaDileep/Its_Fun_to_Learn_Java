package com.pramati.practice.java8;

import com.pramati.practice.java8.beans.Trade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by satyat on 07/06/16.
 */
public class Java_8_Basics implements PredicatesInterface{

    public static void main(String a[]) {

        Java_8_Basics java_8_basics = new Java_8_Basics();
        List<Trade> filteredTrades = java_8_basics.filterTradesUsingPredicate(java_8_basics.generateTradeObjects(), quantityPredicate);
        System.out.println("After filtering using quantity predicate "+quantityPredicate.test(new Trade("a","b",400)));
        filteredTrades.forEach(trade -> System.out.println(trade));
    }

    private List<Trade> generateTradeObjects() {
        List<Trade> tradeObjects = new ArrayList<>();
        for(int i =0 ; i <3; i++)
        {
            Trade trade = new Trade();
            trade.setIssuer(UUID.randomUUID().toString());
            trade.setStatus(UUID.randomUUID().toString());
            trade.setQuantity(Math.round(new Random().nextDouble()*10000)/100.0d);
            tradeObjects.add(trade);
        }
        return tradeObjects;
    }

    private List<Trade> filterTradesUsingPredicate(List<Trade> listOfTradeObjects,Predicate<Trade> predicate){
        return listOfTradeObjects.stream()
                                    .filter(predicate)
                                    .collect(Collectors.toList());
    }
}
