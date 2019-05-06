//Program to convert the string in a file to uppercase and its length
import java.io.File;
import java.util.Scanner;

public class StringUpper {

    public static void main(String args[]) throws Exception
    {
        print();
    }
    private static void print() throws Exception
    {
        File file=new File("file.txt");
        Scanner scan = new Scanner(file);//Taking input from a file
        String text=scan.nextLine();
        String Upperstr = text.toUpperCase();//Converting string to upper case
        int length=text.length();//Finding length and storing it in a variable
        System.out.println("Text:"+Upperstr+"and length:"+length);

    }


}
