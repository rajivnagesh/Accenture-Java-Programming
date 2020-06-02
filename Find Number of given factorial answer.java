import java.util.*;
public class FindNumber{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int flag = 0;
        int number = sc.nextInt();
        sc.nextLine();
        if(number <= 0)
            System.out.println("Invalid Input");
        else
        {
            do{
                if(number%i == 0)
                {
                    number = number / i;
                    i++;
                    flag = 1;
                }
                else
                {
                    System.out.println("Sorry. The given number is not a perfect factorial");
                    flag = 0;
                    break;
                }
            }while(number != 1);
            if(flag == 1)
                System.out.println(i-1);
        }
    }//end main
}