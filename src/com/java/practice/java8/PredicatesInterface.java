package com.java.practice.java8;


import java.util.function.Predicate;
import com.java.practice.java8.beans.Trade;

/**
 * Created by satyat on 11/07/16.
 */
public interface PredicatesInterface {
    Predicate<Trade> quantityPredicate= (Trade t) -> (t.getQuantity() > 70);

    Predicate<Trade> statusPredicate = (Trade t) -> t.getStatus().equals("Completed");
}
