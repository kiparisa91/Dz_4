package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Задача1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");

        for (int j=10 ; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.print("\n");

        //Задача2
        int friday = 1;
        for (; friday <=31; friday=friday+7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
        }

        //Задача3
        for(int year=1822; year >= 1822 && year <= 2122; year++) {
            if (year % 79 == 0)
                System.out.println(year);
        }

    }
}
