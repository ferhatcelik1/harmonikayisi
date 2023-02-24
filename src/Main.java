import java.util.Scanner;
public class Main {
    public static void main (String[] args) {


        double result = 0 ;

        Scanner inp = new Scanner(System.in);

        System.out.print("bir sayı giriniz : ");
        int n = inp.nextInt();

        for (double i = 1; i <=n ; i++) {
            result += (1/i);
        }

        System.out.print(n+"Harmonik seri toplamı : "+result);

    }
}
