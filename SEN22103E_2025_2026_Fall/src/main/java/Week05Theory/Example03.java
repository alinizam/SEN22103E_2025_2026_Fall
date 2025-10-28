/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        char target='a';
        boolean isContain=false;
        int start=97,stop=97;
        while(start<=stop){
            if((char)start==target){
                 isContain = true;
            }
            start++;
        }
        System.out.println(isContain);
    }
}
