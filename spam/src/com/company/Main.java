package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



                Scanner input = new Scanner(System.in);
                int total = 0;

                for (int c = 0; c < 5; ) {
                    System.out.println("Enter your number");
                    int userNum = input.nextInt();

                    total = (userNum + total);
                    c++;


                    System.out.println("The total is " + total);
                    double average = (double) total / c;

                    System.out.println("The average is " + average);
                }


            }
        }


