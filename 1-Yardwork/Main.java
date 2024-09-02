/*
Tenzen Nicholas
tnicho16@u.rochester.edu
9/2/2024
CSC-171 Assignment 1: Yardwork
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static final int bagPounds = 30;
    private static final int bagCost = 9;
    private static final int lightMax = 1500;
    private static final int heavyMax = 20000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthInches = in.nextInt();
        int widthInches = in.nextInt();
        int depthInches = in.nextInt();

        double lengthFeet = lengthInches / 12.0;
        double widthFeet = widthInches / 12.0;
        double depthFeet = depthInches / 12.0;

        double volumeFeet = lengthFeet * widthFeet * depthFeet;
        int bags = (int)Math.ceil(volumeFeet / 1.5);
        int weight = bags * 30;
        int cost = bags * 9;

        String deliveryType;
        if (weight > heavyMax) {
            deliveryType = "special handling";
        } else if (weight > lightMax) {
            deliveryType = "truck";
        } else {
            deliveryType = "car";
        }

        System.out.printf("Bags: %d\n", bags);
        System.out.printf("Cost: %d\n", cost);
        System.out.printf("Delivery: %s\n", deliveryType);
    }
}
