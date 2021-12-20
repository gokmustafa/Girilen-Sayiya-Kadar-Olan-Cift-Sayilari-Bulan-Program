import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int i,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        k=input.nextInt();

        for ( i=1; i<=k; i++ ){
            if (i%2==0){
                System.out.println(i);
            }

        }



    }
}
