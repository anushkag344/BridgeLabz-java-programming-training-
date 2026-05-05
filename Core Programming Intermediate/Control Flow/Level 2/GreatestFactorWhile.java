import java.util.Scanner;
class GreatestFactorWhile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int greatestFactor=1;
        int i=n-1;
        while(i>=n){
            if(n%i==0){
                greatestFactor=i;
                break;

            }
        }
        System.out.println("Greatest factor (excluding number) = "+greatestFactor);
        sc.close();
    }
}