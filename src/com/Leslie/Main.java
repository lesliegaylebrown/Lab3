package com.Leslie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userNum;

        int i;

        int square = 0;
        int cube = 0;
        String answer = "yes";


        do {


            System.out.println("Welcome to the Grand Circus Squarer and Cuber!");
            System.out.println("Please enter an integer");
            // wait for the user to enter an iteger
            userNum = scan.nextInt();
            scan.nextLine();

            for (i = 1; i <= userNum; ++i)

                square = ( userNum * userNum);


                cube = (userNum * userNum * userNum);


                System.out.println("Number\t\tSquare\t\t" +
                        "\tCube");
                System.out.println("======\t\t======\t\t   ======");

                System.out.println("\t" + userNum + "\t\t\t" + square + "\t\t\t" + cube);

                System.out.println("If you would like to continue enter yes");


                answer = scan.nextLine();
            }
            while (answer.equals("yes"));

        }


    }