import java.util.*;
public class Brains
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int total = m * n;
        boolean isBlackWhite = true;
        for(int i = 0; i < total; i++)
        {
            char c = sc.next().charAt(0);
            if(c == 'C' || c == 'M' || c == 'Y')
                isBlackWhite = false;
        }
        if(isBlackWhite)
            System.out.println("#Black&White");
        else
            System.out.println("#Color");
    }
}