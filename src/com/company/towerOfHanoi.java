package com.company;

public class towerOfHanoi {
    static void towerOfHanoi(int n, int from_tower, int to_tower, int ok_tower) {
        if (n == 1) {
            System.out.println("Move disk 1 from tower " + from_tower + " to " + to_tower);
        } else {
            towerOfHanoi(n - 1, from_tower, ok_tower, to_tower);
            System.out.println("Move disk " + n + " from tower " + from_tower + " to " + to_tower);
            towerOfHanoi(n - 1, ok_tower, from_tower, to_tower);
        }
    }
}