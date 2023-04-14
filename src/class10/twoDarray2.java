package class10;

public class twoDarray2 {
    public static void main(String[] args) {
        int [][] matrix =new int [3][3];
        matrix [0][0]=10;
        matrix [1][1]=20;
        matrix [2][2]=50;


    int [] arr1=matrix[0];
    for (int i=0; i<arr1.length; i++){
        System.out.println(arr1[i]);
    }
}
}
