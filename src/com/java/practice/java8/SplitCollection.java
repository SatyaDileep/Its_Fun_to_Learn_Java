package com.java.practice.java8;

import java.util.*;

/**
 * Created by satyat on 09/07/16.
 */
public class SplitCollection {

    public static void main(String[] args) {
        SplitCollection splitCollection =  new SplitCollection();
        Set<String> originalSet = new HashSet<>();
        originalSet.addAll(Arrays.asList("ID", "EncounterID", "CreatedDate", "LastModifiedDate", "RenderingProvider",
                "PostDate", "ServiceDate", "PayerType", "PayerName", "ServiceLocation", "PatiendID", "PaymentID",
                "ChargeID", "ProcedureCode", "Applied", "Refunds"));
        //System.out.println(splitCollection.splitSet(originalSet, 4));

        System.out.println(originalSet.stream().filter(eachString -> eachString.startsWith("P")).count());
        System.out.println(originalSet.stream().filter(eachString -> eachString.startsWith("P")).reduce((acc, string) -> acc+" - "+string).get());
    }

    private List<List<String>> splitSet(Set<String> setToSplit, int partitionSize){
        int originalSetSize = setToSplit.size();
        int numberOfPartitions = 0;
        if(originalSetSize > partitionSize)
            numberOfPartitions = originalSetSize % partitionSize == 0 ? originalSetSize/partitionSize :  originalSetSize/partitionSize + 1;
        if(numberOfPartitions > 0) {
            List<List<String>> listOfSplittedCollection = new ArrayList<>();
            // prepare a collection with desired number of partitioned collections
            for (int i = 0; i < numberOfPartitions; i++) {
                listOfSplittedCollection.add(new ArrayList<>());
            }
            int index = 0;
            for (String str : setToSplit) {
                listOfSplittedCollection.get(index++ % numberOfPartitions).add(str);
            }
            System.out.println("For " + numberOfPartitions + " partitions, size of collection is " + listOfSplittedCollection.size());
            return  listOfSplittedCollection;
        }
        System.out.println("no need to partition");
        return null;
    }
}
