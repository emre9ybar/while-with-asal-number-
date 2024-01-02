import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number :");
        int number =scan.nextInt();
        int i = 2;
        while (i<=number){
            boolean asalNumber=true;
            for (int j = 2 ;j < i; j++){
                if (i % j==0){
                    asalNumber=false;
                    break;
                }

            }

            if (asalNumber){
                System.out.println("Asal number :"+i);

            }
            i++;
        }


    }
}