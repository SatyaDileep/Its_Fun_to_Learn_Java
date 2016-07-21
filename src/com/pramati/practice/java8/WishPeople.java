package com.pramati.practice.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by satyat on 23/06/16.
 */

class testClass implements Interface_with_default_method{
    @Override
    public void sayHello(String name) {
        System.out.println("hey "+name);
    }
}
public class WishPeople implements Interface_with_default_method {
    private static final String CLAIM_COMPLETED = "complete";
    private static final String CLAIM_PENDING_PATIENT = "pending patient";
    @Override
    public void sayHello(String name) {

        System.out.println("Hello "+name);
        System.out.println(name.toLowerCase().equals(CLAIM_PENDING_PATIENT));
    }

    public static void main(String[] args) {
        WishPeople sp = new WishPeople();
        String returned = sp.sayHi("1");
        System.out.println(returned);

        final Object[] FILE_HEADER = {"ID", "EncounterID", "CreatedDate", "LastModifiedDate", "RenderingProvider", "PostDate", "ServiceDate", "PayerType", "PayerName", "ServiceLocation", "PatiendID", "PaymentID", "ChargeID", "ProcedureCode", "Applied", "Refunds"};

        List<String> fileHeader = Arrays.asList(FILE_HEADER.toString());
        System.out.println(fileHeader.get(0).toString());
        fileHeader.stream().forEach(s-> System.out.println(s));
    }
}
