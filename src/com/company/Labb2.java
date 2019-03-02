package com.company;

public class Labb2 {
    public static void main(String[] arg) {
        double n=3,m=3;
        double res = 0;
        double [][]A = new double[][]{
                {4,1,-6},
                {3,6,1},
                {2,1,3}
        };
        for (int i = 0; i <n; i++){
            for (int j=0;j<m;j++){
                double Abc=A[i][j];
                res += Abc;
            }
            int S =i+1;
            System.out.println("Среднее значение " + S + " строчки = " + res/3);
            res=0;
        }
    }
}