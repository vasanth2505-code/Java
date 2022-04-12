import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 25;
        arr[3] = 15;
        arr[4] = 35;


        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 1-50: ");
        int x = s.nextInt();
            if(x<1 || x > 50){
                System.out.println("Enter valid number.");
            }
            else{
                int high = arr.length - 1;
                
                int result = binary_Search(arr, 0, high, x);
                
                if (result == -1)
                    System.out.println("\nBetter luck next time!");
                else
                    System.out.println("\nBINGO !!");
                
            }
            

        
    }
    
    public static int binary_Search(int intArray[], int low, int high, int key){  
        
        if (high>=low){  
            
            int mid = low + (high - low)/2;  
            
            if (intArray[mid] == key){  
            return mid;  
            }  
            
            if (intArray[mid] > key){  
            return binary_Search(intArray, low, mid-1, key); 
            }else       
            {  
            return binary_Search(intArray, mid+1, high, key);
            }  
        }  
        return -1;
    }
}