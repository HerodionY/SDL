/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author ACER
 */
public class larik {
    public static int binarySearch2(int array[],int toFind){
    int l=0,h=array.length-1;
        while( l<=h){
            int mid=(l+h)/2;
           
                if (toFind==array[mid]) {
                    return mid;
                    
                }
                else if (toFind>array[mid]) {
                    l=mid+1;
                    
                }
                else if (toFind<array[mid]) {
                    h=mid-1;
                }
            
            }
            
        
        return -1;
    }
    public static int InterpolationSearch2(int array[],int toFind){
        int l=0,h=array.length-1;
      while( l<=h){
            int mid = l+((toFind-array[l])*(h-l))/(array[h]-array[l]);
            
                if (toFind==array[mid]) {
                    return mid;
                    
                }
                else if (toFind<array[mid]) {
                    h=mid-1;
                }
                else if (toFind>array[mid]) {
                    l=mid+1;
                }
            }
        
        return -1;
    
    }
    public static int sequentialSearch(int array[],int toFind){
        for (int i = 0; i < array.length; i++) {
            if (toFind==array[i]) {
                return i;
                
            }
            
        }
        return -1;
    
    }
    public static int BinarySearch(int array[],int toFind){
        int low=0,high=array.length-1;
    while(low<=high){
    int mid=(low+high)/2;
        if (array[mid]==toFind) {
            return mid;
            
        }
        else if (toFind<array[mid]) {
            high=mid-1;
            
        }
        else if (toFind>array[mid]) {
            low=mid+1;
            
        }
    }
        return -1;
    
    }
    public static int interpolationSearch(int array[],int toFind){
    int low=0,high=array.length-1;
    while(low<=high){
    int mid=low+((toFind-array[low])*(high-low))/(array[high]-array[low]);
            if (toFind==array[mid]) {
            return mid;
        }
            else if (toFind<array[mid]) {
                high=mid-1;
            
        }else if (toFind>array[mid]) {
            low=mid+1;
            
        }
    
    }
        return -1;
    
    }
    public static void bubleSort(int array[]){
    int n=array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;   
                }  
            } 
        } 
    }
    public static void selectionSort(int array[]){
    int n=array.length;
        for (int i = 0; i <= n-2; i++) {
            int min=i;
            for (int j = i+1; j <= n-1; j++) {
                if (array[j]<array[min]) {
                    min=j;     
                }    
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
    public static void insertionSort(int array[]){
        for (int i = 1; i < array.length; i++) {
            int temp=array[i];
            int j=i-1;
            while(j>=0 && array[j]>=temp){
                array[j+1]=array[j];
            j=j-1;
            }
            array[j+1]=temp;
        }
    }
    public static int SequentialSearch2(int array[],int toFind){
        for (int i = 0; i < array.length; i++) {
            if (toFind==array[i]) {
                return i;
            }
            
        }
        return -1;
    
    }
   public static int binarySearch3(int array[],int toFind){
   int l=0,h=array.length-1;
   while(l<=h){
   int mid = (l+h)/2;
       if (toFind==array[mid]) {
           return mid;
       }
       else if (toFind<array[mid]) {
           h=mid-1;
       }
       else if (toFind>array[mid]) {
           l=mid+1;
       }
   }
        return -1;
   
   }
   public static int SequentialSearch3(int array[],int toFind){
       for (int i = 0; i < array.length; i++) {
           if (toFind==array[i]) {
               return i;
           }
       }
        return -1;
   }
   public static int InterpolationSearch3(int array[],int toFind){
   int l=0,h=array.length-1;
   while(l<=h){
   int mid=l+((toFind-array[l])*(h-l))/(array[h]-array[l]);
       if (toFind==array[mid]) {
           return mid;
       }
       else if (toFind<array[mid]) {
           h=mid-1;
       }
       else if(toFind>array[mid]){
       l=mid+1;
       }
   }
        return -1;
   }
   public static void insertionSort2(int array[]){
       for (int i = 0; i < array.length; i++) {
           int temp=array[i];
           int j=i-1;
           while(j>=0 && array[j]>=temp){
           array[j+1]=array[j];
           j=j-1;
           }
           array[j+1]=temp;
   
                   }
   }
   public static void selectionSort2(int array[]){
   int n=array.length;
       for (int i = 0; i < n-2; i++) {
           int min=i;
           for (int j = i+1; j < n-1; j++) {
               if (array[j]<array[min]) {
                   min=j;
               }
               
           }
           int temp=array[i];
           array[i]=array[min];
           array[min]=array[i];
           
           
       }
   }
}
