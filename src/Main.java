import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        int r = num -1;
        int check = recursivePrime(num ,r);
        if (check ==1)
        {
            System.out.println(num + " sayısı ASAL değildir !");
        }else {
            System.out.println(num + " sayısı ASALDIR !");
        }
    }
    static int recursivePrime(int n ,int r)
    {
        if(r != 1) {
            if (n % r == 0) {
                return 1;
            }
            return recursivePrime(n, r - 1);
        }
        return 0;
    }
}