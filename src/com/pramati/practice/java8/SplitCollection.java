package com.pramati.practice.java8;

import java.util.*;

/**
 * Created by satyat on 09/07/16.
 */
public class SplitCollection {

    public static void main(String[] args) {
        SplitCollection splitCollection =  new SplitCollection();
        Set<String> originalSet = new HashSet<>();
        originalSet.addAll(Arrays.asList("ID", "EncounterID", "CreatedDate", "LastModifiedDate", "RenderingProvider", "PostDate", "ServiceDate", "PayerType", "PayerName", "ServiceLocation", "PatiendID", "PaymentID", "ChargeID", "ProcedureCode", "Applied", "Refunds"));
        //splitCollection.splitSet(originalSet, 4);

        System.out.println(originalSet.stream().filter(eachString -> eachString.startsWith("P")).count());
        System.out.println(originalSet.stream().filter(eachString -> eachString.startsWith("P")).reduce((acc, string) -> acc+" - "+string).get());
        //originalSet.stream().forEach(s -> System.out.println(s));
    }

    public void splitSet(Set<String> setToSplit, int partitionSize){
        int originalSetSize = setToSplit.size();
        int numberOfPartitions = 0;
        if(originalSetSize > partitionSize)
            numberOfPartitions = originalSetSize % partitionSize == 0 ? originalSetSize/partitionSize :  originalSetSize/partitionSize + 1;
        List<List<String>> listOfSplittedCollection = new ArrayList<>();
        for(int i = 0; i< numberOfPartitions; i++){
            listOfSplittedCollection.add(new ArrayList<>());
        }
        System.out.println("For "+numberOfPartitions+" partitions, size of collection is "+listOfSplittedCollection.size());
    }
}
