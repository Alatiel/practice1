/**
 * Created by inna on 18/08/2016.
 */
public class class1 {

    public static void main (String[] args){

        int[] numbersArray = new int[]{5,4,3,2,1,2,3,4,5};

        for (int repeat = 0;repeat<numbersArray.length; repeat++){

            for (int i = 0; i<numbersArray.length-1; i++) {

                if (numbersArray[i] < numbersArray[i]) {
                    int temp = numbersArray[i];
                    numbersArray[i] = numbersArray[i + 1];
                    numbersArray[i + 1] = temp;
                }
            }
            System.out.println();
        }

    }
}
