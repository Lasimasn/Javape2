//Program to check if a number is power of four with test case
public class PowerOfFour
{
    public String isPower(int number)
    {
        int orignum=number;
        if (number == 0)
            return "Number " +orignum+ " is not a power of 4";
        while (number != 1)
        {
            if (number % 4 != 0)//checking if number is power of 4
                return "Number " +orignum+ " is not a power of 4";
            number = number / 4;
        }
        return "Number " +orignum+ " is a power of 4";
    }
}
