import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        int n, m, rev = 0, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            rev = rev * 10 + x;
            n = n / 10;
        }
        if(rev == m)
        {
            System.out.println(" "+m+" is a palindrome number");
        }
        else
        {
            System.out.println(" "+m+" is not a palindrome number");
        }
    }
}
