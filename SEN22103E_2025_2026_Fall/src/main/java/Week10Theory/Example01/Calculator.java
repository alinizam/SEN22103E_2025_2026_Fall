/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory.Example01;

/**
 *
 * @author ali.nizam
 */
public class Calculator {
    int sumInt(int a,int b){
        return a+b;
    }
    double sumDouble(double a,double b){
        return a+b;
    }
    int sum(int a,int b){
        return a+b;
    }
    //erronous implementation
    /*int sum(int m,int n){
        return m+n;
    }*/
    double sum(double a,double b){
        return a+b;
    }
    double sum(double a,double b,double c){
        return a+b+c;
    }
    double sum(double a){
        return a;
    }
    double sum(double a, int b){
        System.out.println("double+int");
        return a;
    }
    //incorrect implementation of overloading
    /*int sum(double a, int b){
        System.out.println("double+int");
        return a;
    }*/
}
