import apple.laf.JRSUIConstants;

/**
 * Created by inna on 18/08/2016.
 */
public class class1 {

    public static void main (String[] args){

        int[] numbersArray = new int[]{5,4,3,2,1,2,3,4,5};

        for (int repeat = 0;repeat<numbersArray.length; repeat++){ //for (int r : numbersArray)

            for (int i = 0; i<numbersArray.length-1; i=i+1) {

                if (numbersArray[i] < numbersArray[i+1]) {
                    int temp = numbersArray[i];
                    numbersArray[i] = numbersArray[i + 1];
                    numbersArray[i + 1] = temp;
                }
            }
            System.out.println("repeat " + repeat);

            showArray(numbersArray);
        }
    }
    public static void showArray(int[] array){

        System.out.println();

        for(int r:array){
            System.out.print(r+",");
        }

        System.out.println();
    }
}
