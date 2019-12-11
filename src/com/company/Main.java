package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int level = 1;
        Scanner in  = new Scanner(System.in);
        System.out.println("WELCOME TO THE GACHI CLUB! \n Ultimate fighting simulator");
        System.out.println("Choose your name:");
        String name = in.nextLine();
        Unit player = new Player(name,30,3,"grab",0);
        ;
        while (level < 6){
            System.out.println("Вы на уровне "+level);
            switch (new Random().nextInt(2)) {
                case 0:
                    Unit Billy = new Billy("Billy", 20+level, 4+1, "hands", 10+level*2, 2);
                    System.out.println("Ваш противник -"+Billy.getName());
                    break;
                case 1:
                    Unit Van = new VanDarkholme("VanDarkholme", 13+level*2, 6+1, "whip", 10+level*3);
                    System.out.println("Ваш противник -"+Van.getName());
                    break;
            }
            level++;
        }
    }
}
