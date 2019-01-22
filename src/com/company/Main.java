package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Tower of Hanoi Game.\nThis program will solve this puzzle for you.\nPlease input number of disks to solve for: ");
        int n = hi.nextInt();
        towerOfHanoi.towerOfHanoi(n, 1, 3, 2);

    }
}
