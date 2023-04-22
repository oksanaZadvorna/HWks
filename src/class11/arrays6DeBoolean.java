package class11;

public class arrays6DeBoolean {
    public static void main(String[] args) {

        //with help of loops count how many times we have true in the below 2Darray

        boolean [][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };
        int counter = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean bool : arr1D) {

                if(bool==true){
                    counter++;
                }

            }
            System.out.println(counter);

        }

        }


            
        }

