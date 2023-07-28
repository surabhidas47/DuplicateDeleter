package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        String noDupe = "";

        for (int i =0;i<array.length;i++){
            //for comparing in the second for loop
            Integer integer = array[i];
            Integer counter =0;

            for (int j=0;j<array.length;j++){
                if (integer.equals(array[j])){
                    //we are keeping track of this counter bc will compare it to the given var exactNumOfDuplications
                    counter++;

                }
            }
            //now we wana pull out all the values that dont equal the given parameter
            //given 2 for instance, if theres anything that is in the array more than twice it
            //gets taken out
            if(!(counter>=maxNumberOfDuplications)){
                //if the given number is 0 or 1 the counter would never be greater
                //and array would be empty
                noDupe += array[i] +" ";
            }

        }
        //split at  spaces
        String [] stringResult = noDupe.split(" " );
        Integer [] results = new Integer[stringResult.length];
        //incase array is empty
        if(noDupe.equals("")) {
            //return an empty array
            return new Integer[0];
        } else{

        for (int i =0;i<results.length;i++){
            //so now we are getting the Int value of stringResult
            results[i] =Integer.valueOf(stringResult[i]);
        }
            }
        return results;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String noDupe = "";

        for (int i =0;i<array.length;i++){
            //for comparing in the second for loop
            Integer integer = array[i];
            Integer counter =0;

            for (int j=0;j<array.length;j++){
                if (integer.equals(array[j])){
                    //we are keeping track of this counter bc will compare it to the given var exactNumOfDuplications
                    counter++;

                }
            }
            //now we wana pull out all the values that dont equal the given parameter
            if(!(counter==exactNumberOfDuplications)){
                noDupe += array[i] +" ";
            }

        }
        //split at  spaces
        String [] stringResult = noDupe.split(" " );
        Integer [] results = new Integer[stringResult.length];

        for (int i =0;i<results.length;i++){
            //so now we are getting the Int value of stringResult
            results[i] =Integer.valueOf(stringResult[i]);
        }
        return results;
                //new Integer[0];
    }
}
