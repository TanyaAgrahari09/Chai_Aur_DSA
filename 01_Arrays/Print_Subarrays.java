
//for n elements in an array: total number of subarrays is {n*(n+1)}/2 


public class Print_Subarrays {

    public static void print_Subarrays(int numbers[]){
        int total_Subarrays = 0;

        for(int i = 0; i< numbers.length; i++){
            
            for(int j =i; j<numbers.length;j++){
                
                for(int k = i; k <=j; k++){
                    
                    System.out.print(numbers[k]+ " ");
                     
                }
                
                total_Subarrays++;
                System.out.println();
               
            }
            System.out.println(" ");
        }
        System.out.println("Total number of subarrays is: "+ total_Subarrays);
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        print_Subarrays(numbers);
    }
}
