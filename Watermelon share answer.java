import java.util.Scanner;
import java.text.DecimalFormat;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double myshare = 0,bro_share = 0,friend_share = 0,bro_share1 = 0,myshare1 = 0;
        //double myshare2 = 0, bro_share2 = 0, friend_share1 = 0;
        System.out.println("Enter the weight of the watermelon in Kgs:");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the number of friends:");
        int no_of_friends = sc.nextInt();
        sc.nextLine();
        if(weight<=0 || no_of_friends<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            myshare = weight - (0.75*weight);
            bro_share = weight - (0.25 * weight);
            friend_share = ((0.75*bro_share) + (0.25*myshare))/no_of_friends;
            myshare1 = myshare - (0.25*myshare);
            bro_share1 = bro_share - (0.75*bro_share);
            String myshare2 = new DecimalFormat("0.00").format(myshare1);
            System.out.println("My share of Watermelon:"+myshare2+"Kgs");
            String bro_share2 = new DecimalFormat("0.00").format(bro_share1);
            System.out.println("My brother's share:"+bro_share2+"Kgs");
            String friend_share2 = new DecimalFormat("0.00").format(friend_share);
            System.out.println("Each of our friend's share: "+friend_share2+"Kgs");
        }
    }
}