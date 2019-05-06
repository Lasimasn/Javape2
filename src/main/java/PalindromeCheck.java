//Program to find palindrome of a string or a number with test cases.
import static java.lang.Character.isDigit;

public class PalindromeCheck {

    public String PalindromeDigit(int n)
    {
        int digit,reverse=0;
        int orignumber=n;

        while(n>0)//code to reverse a number
        {
            digit = n % 10;
            reverse=reverse*10+digit;
            n=n/10;
        }

        if(orignumber==reverse)
            return "Number is palindrome";
        else
            return "Number is not palindrome";
    }
    public String PalindromeAlpha(String array)
    {
        String reverse="";
        int length=array.length();
        for(int i=length-1;i>=0;i--)//reversing the array
            reverse=reverse+array.charAt(i);
        if(array.equals(reverse))
            return "Is palindrome";
        else
            return "Not palindrome";
    }
}
