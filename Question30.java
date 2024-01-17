import java.util.Scanner;

public class Question30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no.of rows");
        int rows = sc.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=2*i-1; j++){
                if(j == 1 || j == 2*i-1 || (i == rows && j%2 != 0)){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
