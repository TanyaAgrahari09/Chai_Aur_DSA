public class LargestInArray {

    public static int Largest_In_Array(int numbers[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i< numbers.length; i++){
             if(numbers[i] >= max){
                max = numbers[i];
             }
        }
        return max;
    }
    public static void main(String[] args) {
        int numbers[]=  {2,6,5,4,10,12,16,0};
        int largest = Largest_In_Array(numbers);
        System.out.println("Largest number is: "+ largest);

    }
}
