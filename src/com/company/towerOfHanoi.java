package com.company;

public class towerOfHanoi {
    static void towerOfHanoi(int n, char from_tower, char to_tower, char ok_tower) {
        if (n == 1) {
            System.out.println("Move disk 1 from tower " + from_tower + " to " + to_tower);
            return;
        }
        towerOfHanoi(n - 1, from_tower, ok_tower, to_tower);
        System.out.println("Move disk " + n + " from tower " + from_tower + " to " + to_tower);
        towerOfHanoi(n - 1, ok_tower, to_tower, from_tower);
    }
}
