import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements,subset,total1 = 1,total2 = 1,total3 = 1;
        System.out.print("number of elements(n): ");
        numberOfElements = scanner.nextInt();
        System.out.print("number of subset elements(r): ");
        subset = scanner.nextInt();

        if(numberOfElements < 0 || subset < 0){
            System.out.println("Please enter numbers greater than 0");
            System.exit(0);
        }

        for(int i = 1; i<= numberOfElements;i++){
            total1 *= i;
        }
        for(int j = 1; j<= subset;j++){
            total2 *= j;
        }
        for(int k = 1; k<= (numberOfElements-subset);k++){
            total3 *= k;
        }
        System.out.println("Combination = "+((total1)/(total2*total3)));
    }
}
