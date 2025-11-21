/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        //int[][] numbers=new int[5][4];
        //{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}}
        int[][] numbers={{1,3},{1,7,2},{8}};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(i+" : "+j+" : "+numbers[i][j]);
                sum+=numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
