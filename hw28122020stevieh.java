/* HW from 28.12.2020      https://github.com/qa191120/28.12.2020/blob/main/home_work.java
         1. input array size from user
            create int array in the given size
            populate the array with random numbers
            sum the array
            print the average number
         2. create an array of 5 Strings (hint: String[] word = new String[5])
            create a for loop and input words from the user into the array
            now print the array in a for loop
            *** etgar: print the average length of the words, i.e.  hello java book pro about. the words length is  [5,4,4,3,5] => average=4.2
         3. create int array A with random numbers (size of 5)  
            create int array B with random numbers (size of 5)
            create int array C (size of 5) which each element will be the sum of A+B
            for exmaple: 
            A [ 5, 8, 6, 2, 3]  -- random
            B [ 3, 7, 8, 3, 1]  -- random
            C [ 8,15,14, 5, 4]  -- sum
            *etgar: create int array D which will contain the larger name from A or B
            *D[ 5, 8, 8, 3, 3]
            *etgar: create in array E which will be concat of the array A and B
            *E[ 5, 8, 6, 2, 3, 3, 7, 8, 3, 1]
         4. ***etgar crazy:
            input number of classes from user
            for each size input number of students
            input all numbers from user
            calculate the average of each class in an array
            calculate the average of averages
 */
 
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner prn = new Scanner(System.in);
        Random r = new Random();
             
        //ex1
        System.out.println("Please enter array size: ");
        int arr_size1 = prn.nextInt();
        int[] arr_rnd1 = new int[arr_size1];
        for (int index = 0; index < arr_rnd1.length; index++)
        {
            arr_rnd1[index] = r.nextInt(100);
        }
        System.out.println("The array numbers are: ");
        for (int index = 0; index < arr_rnd1.length; index++)
        {
            System.out.print(arr_rnd1[index] + "  ");
        }
        System.out.println();
        float sum1 = 0;
        for (int index = 0; index < arr_rnd1.length; index++)
        {
            sum1 = sum1 + arr_rnd1[index];
        }
        float avg1 = sum1 / arr_rnd1.length;
        System.out.println("The average is: " + avg1);

        //ex2
        String[] words = new String[5];
        System.out.println("Please enter five words: ");
        float sum2 = 0;
        for (int index = 0; index < words.length; index++)
        {
            words[index] = prn.next();
            sum2 = sum2 + words[index].length();
        }
        System.out.println("The words are: ");
        for (int index = 0; index < words.length; index++)
        {
            System.out.print(words[index] + "  ");
        }
        System.out.println();
        float avg2 = sum2 / words.length;
        System.out.println("The average words length is: " + avg2);

        //ex3
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];   // to be sum of elements of A, B
        int[] D = new int[5];   // to be the larger of each element of A, B
        int[] E = new int[10];  // to be concat of A, B
        for (int index = 0; index < 5; index++)
        {
            A[index] = r.nextInt(100);
            B[index] = r.nextInt(100);
            C[index] = A[index] + B[index];
            if (A[index] > B[index])
            {
                D[index] = A[index];
            }
            else
            {
                D[index] = B[index];
            }
            E[index] = A[index];
            E[index + A.length] = B[index];
        }
        for (int index = 0; index < E.length; index++)
        {
            System.out.print(E[index] + "  ");
        }
        System.out.println();

        //ex4
        System.out.println("Please enter number of classes: ");
        int num_classes = prn.nextInt();
        float[] avg_of_avgs = new float[num_classes];
        for (int i1 = 0; i1 < num_classes; i1++)
        {
            System.out.println(String.format("Please enter number of students in class %d: ", i1 + 1));
            int num_students = prn.nextInt();
            float sum4 = 0;
            int[] grades = new int[num_students];
            for (int i2 = 0; i2 < num_students; i2++)
            {
                System.out.println(String.format("Please enter grade for student %d: ", i2 + 1));
                grades[i2] = prn.nextInt();
                sum4 += grades[i2];
            }
            avg_of_avgs[i1] = sum4 / num_students;
        }
        float sum4 = 0;
        for (int i1 = 0; i1 < avg_of_avgs.length; i1++)
        {
            sum4 += avg_of_avgs[i1];
        }
        System.out.println("The average of the averages of grades is: " +  sum4 / num_classes);

    }
}


