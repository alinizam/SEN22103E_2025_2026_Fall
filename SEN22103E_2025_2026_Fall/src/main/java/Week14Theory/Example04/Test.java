/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class Test {
 
    public static void main(String[] args) {
        IFilter evenFilter=new IFilter() {
            @Override
            public boolean filter(int i) {
                return i%2==0;
            }
        };
        int [] numbers={1,2,6,5,8};
        showElement(numbers, evenFilter);
        IFilter oddFilter=(n)->{return n%2==1;};
        showElement(numbers, oddFilter);
        
    }
    static void showElement(int [] number, IFilter f){
        for (int i : number) {
            if (f.filter(i)){
                System.out.println(i);
            }
        }
    }
}
