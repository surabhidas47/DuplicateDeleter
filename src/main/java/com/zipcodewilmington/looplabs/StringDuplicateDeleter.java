package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String noDupe = "";

        for (int i =0;i<array.length;i++){
            //for comparing in the second for loop
            String str = array[i];
            Integer counter =0;

            for (int j=0;j<array.length;j++){
                if (str.equals(array[j])){
                    //we are keeping track of this counter bc will compare it to the given var exactNumOfDuplications
                    counter++;

                }
            }

            if(!(counter>=maxNumberOfDuplications)){
                //dont want all the strings to joined together into one word
                noDupe += array[i]+ " ";
            }

        }
        if(noDupe.length()==0){
            return new String[0];
        }

        String [] result = noDupe.split(" ");
        return result;
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String noDupe = "";

        for (int i =0;i<array.length;i++){
            //for comparing in the second for loop
            String str = array[i];
            Integer counter =0;

            for (int j=0;j<array.length;j++){
                if (str.equals(array[j])){
                    //we are keeping track of this counter bc will compare it to the given var exactNumOfDuplications
                    counter++;

                }
            }

            if(!(counter==exactNumberOfDuplications)){
                //dont want all the strings to joined together into one word
                noDupe += array[i]+ " ";
            }

        }

        String [] result = noDupe.split(" ");

        return result;
    }
}
