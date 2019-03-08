package com.company.lab4;
import java.util.*;

public class Lab4 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Mebel Stol = new Mebel();
        Mebel Kreslo = new Mebel();
        Mebel Divan = new Mebel();
        Mebel Komod = new Mebel();
        Mebel Shkaf = new Mebel();
        Stol.width = scanner.nextDouble();
        Stol.depth = scanner.nextDouble();
        Stol.height = scanner.nextDouble();
        Stol.room = "кабинет";
        Kreslo.width = scanner.nextDouble();
        Kreslo.height = scanner.nextDouble();
        Kreslo.room = "кабинет";
        Kreslo.material = "Пластик и кожзам";
        Komod.width = scanner.nextDouble();
        Komod.depth = scanner.nextDouble();
        Komod.room = "спальня";
        Divan.width = scanner.nextDouble();
        Divan.depth = scanner.nextDouble();
        Divan.room = "гостинная";
        Shkaf.width = scanner.nextDouble();
        Shkaf.height = scanner.nextDouble();
        Shkaf.room = "спальня";
        double[] widt = {Stol.width,Kreslo.width,Komod.width,Divan.width,Shkaf.width};
        System.out.println(widt);
        for (int j = 0; j < 5; j++) {
            double A = widt[j];
            System.out.print(A+",");

        }

    }
}
