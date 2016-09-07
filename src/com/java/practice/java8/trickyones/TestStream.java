package com.java.practice.java8.trickyones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Created by satyat on 02/09/16.
 */
public class TestStream {

    static void mainOther(){
        String resourceIdsCommaDelimed= "1-244,10-324";
        ArrayList<Long> resources = new ArrayList<>();
        List<Long> resourceTypeIds = new ArrayList<>();

        if(resourceIdsCommaDelimed != null){
            String[] resourceTokens = resourceIdsCommaDelimed.split(",");

            // every token will be in the form of resourceTypeId-resourceId
            Arrays.stream(resourceTokens).forEach(eachResourceToken -> {
                if(eachResourceToken.contains("-")) {
                    resourceTypeIds.add(Long.parseLong((eachResourceToken.split("-")[0])));
                    resources.add(Long.parseLong(eachResourceToken.split("-")[1]));
                }
            });

            // when appointment gets created from PM, resourceId will be null. Set resourceId as the first non-room resource from resourceIds list
            IntPredicate nonFacilityResources = resource -> !resourceTypeIds.get(resource).equals(1L);
            int indexWithNonFacility = IntStream.range(0, resourceTypeIds.size())
                    .filter(nonFacilityResources)
                    .findFirst()
                    .orElse(-1);
                if (indexWithNonFacility != -1)
                    System.out.println(resources.get(indexWithNonFacility));
                else
                    System.out.println("bla");
        }
    }
    public static void main(String[] args) {
        mainOther();
        /*String resourceIdTypesCommaDelimited = "4,1,2,1,1,3,1";
        List<String> listofResourceTypeIds = new ArrayList<>(Arrays.asList(resourceIdTypesCommaDelimited.split(",")));

        System.out.println(listofResourceTypeIds);
        IntPredicate nonFacilityResources = resource -> !listofResourceTypeIds.get(resource).equals("1");
        int index = IntStream.range(0, listofResourceTypeIds.size())
                            .filter(nonFacilityResources)
                            .findFirst()
                            .orElse(-1);
        if(index!=-1)
        System.out.println(index);
        else
            System.out.println("he");*/
    }
}
