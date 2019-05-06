//Program to chack the average,maximum and minimum grades of a student

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {


    public static void main(String args[])
    {
        System.out.println("Enter the limit");//Number of grades to be entered
        Scanner scan=new Scanner(System.in);
        int limit=scan.nextInt();
        int marks[]=new int[limit];
        System.out.println("Input Grades");//Input marks
        for(int i=0;i<limit;i++)
            marks[i]=scan.nextInt();
        Student student=new Student();
        student.average(limit,marks);
        student.maximum(limit,marks);
        student.minimum(limit,marks);

    }
    public void average(int limit, int[] marks)//Finding the average of grades
    {
        int sum=0,avg=0;
        for(int i=0;i<limit;i++)
            sum+=marks[i];
        avg=sum/limit;
        float average=avg;
        System.out.println("The average of " +limit+ " numbers is:"+average);
    }
    public void maximum(int limit, int[] marks)//Finding the maximum of grades
    {
        int max=0;
        for(int i=0;i<limit;i++)
            if(marks[i]>max)
                max=marks[i];
        System.out.println("Maximun mark:"+max);
    }
    public void minimum(int limit, int[] marks)//Finding the minimum of grades
    {
        int min=marks[0];
        for(int i=1;i<limit;i++)
            if(min>marks[i])
                min=marks[i];
        System.out.println("Minimum mark:"+min);
    }
}
