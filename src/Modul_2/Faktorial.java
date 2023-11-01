/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;

/**
 *
 * @author ACER
 */
public class Faktorial {
    

    
    
    
    static long faktorialIteratif(int n){
        long hasFakn=1;
        if(n==1)return 1;
        else for (int i = 1; i <=n; i++) 
            hasFakn=hasFakn*i;
            
                
            
        return hasFakn;
    }
    public static int faktorialRecursive (int n) 
	{
		if ( n == 1)
			return 1;
		else
			return (n * faktorialRecursive (n-1));
	}
}

