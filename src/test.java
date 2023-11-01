/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class test {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.printf("effects of passing reference to entire array:%n"+"The value of the original array are:%n");
        
        for (int value : array)
            System.out.printf("%d", value);
            modifyArray(array);
            
        System.out.printf("%n%nThe values of the modified array are:%n");
            for (int value : array){
                System.out.printf("%d ",value);
            }
    System.out.printf("%n%nEffects of passing array element value : %n"+"array[3] before modifyelemnt : %d%n" ,array[3]);
        modifyElement(array[3]);
        System.out.printf("array [3] after modiftyElement : %d%n",array[3]);
    }
   
    public static void modifyArray(int[] array2) {

    for (int i = 0; i < array2.length; i++){
        array2[i]*=2;
    }
}

    public static void modifyElement(int element){
        element*=2;
        System.out.printf("value of eleemnt in modifyElemnt : %d%n", element);
    }
}
