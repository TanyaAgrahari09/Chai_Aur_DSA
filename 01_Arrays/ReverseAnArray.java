public class ReverseAnArray {
    public static void printing_Rev_Array(int numbers[]){
        int start = 0;
        int end = numbers.length -1;
        while(start <= end){

             //swap 
             int temp = numbers[start];
             numbers[start] = numbers[end];
             numbers[end] = temp;

             //updating start and end
             start += 1;
             end -= 1;

        }
        System.out.println("Reversed array is :");
        for(int i = 0; i<numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printing_Rev_Array(numbers);

    }
}
