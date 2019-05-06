//Program to count the frequency of words in a string


import jdk.jfr.Frequency;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class FrequencyCount {

        public static void main(String args[])throws Exception
        {
            FrequencyCount frequency=new FrequencyCount();
            frequency.frequencyCount();
        }

        private static void frequencyCount() throws Exception {
            //File file = new File("Home/fileDemo.txt");
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();
            String[] array = text.split(" ");
            String[] array2 = new String[array.length];//new array to store words
            int count = 0, k = 0;
            for (int i = 0; i <array.length; i++) {
                if (Arrays.asList(array2).contains(array[i]))//checking to see if the new array contains the word
                    continue;
                else {
                    array2[k] = array[i];//insert words into the array
                    k++;
                }
                for (int j = 0; j <array.length; j++) {
                    if (array[i].equals(array[j]))//checking to count the occurance of a word in a string
                        count++;
                }
                System.out.println("The word " + array[i] + " occurs " + count + " times");
                count=0;//re-initializing count to 0 for the next loop
            }
        }

    }
