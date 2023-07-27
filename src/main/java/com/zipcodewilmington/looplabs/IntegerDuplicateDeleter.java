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
        return new Integer[0];
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
