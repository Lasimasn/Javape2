public class Factorial {
    public static void main(String args[])

    {
        Factorial fact=new Factorial();
          fact.intFact();
          fact.longFact();
    }

    public void intFact()//factorial for integers
    {
        int fact=1;
        for (int i=1;i<Integer.MAX_VALUE;i++) {
            for (int j = 1; j <= i; j++) {
                fact = fact * j;//finding the factorial
            }

            if (i == 13) {
                System.out.println("The factorial is out of range!!");//condition for integer factorial
                break;
            }
            else
                System.out.println("Factorial of the number " + i + "is " + fact);
            fact=1;


        }
    }
    public void longFact()//factorial for long integer
    {
        long fact=1;
        for (long i=1;i<Long.MAX_VALUE;i++) {
            for (long j = 1; j <= i; j++) {
                fact = fact * j;
            }

            if (i == 21) {
                System.out.println("The factorial is out of range!!");//condition for long integer factorial
                break;
            }
            else
                System.out.println("Factorial of the number " + i + "is " + fact);
            fact=1;


        }
    }

}
