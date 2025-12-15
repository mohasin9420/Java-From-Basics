import java.util.Scanner;

public class Fabbi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        int f=0;
        int s=1;
        int count =2;
        while(count<=n){
          int temp=f+s;
          f=s;
          s=temp;
          count ++;
          System.out.println(s);



        }

    }
}
