package Reviews;

public class ContinueKeyword {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==3){
                continue; //will continue the iteration but will skip the #3
            }
            System.out.println(i);
            System.out.println("Hi");
            System.out.println("Bye");
        }
    }
}
