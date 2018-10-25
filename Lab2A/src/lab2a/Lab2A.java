
package lab2a;

import java.util.Scanner;


public class Lab2A {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int number = 0;
        int smallNum = 100;
        int largeNum = 0;
        int denom = 0; 
        double avg;
        int UN;
        
                
    System.out.println("Enter Ten integers from 1-100 ");
      
        for(int i = 0; i < 10; i++){
            
           UN = keyboard.nextInt();

            if(UN < smallNum){
              smallNum = UN;  
            }
            
            if(UN > largeNum){
              largeNum = UN;
            }
            
           number = number + UN;
           denom++;  
          
        }
        
        avg = number / denom; 
        System.out.println("Smallest: " + smallNum);
        System.out.println("Largest : " + largeNum);
        System.out.println("Average : " + avg);      
       
        
    }
    
}
