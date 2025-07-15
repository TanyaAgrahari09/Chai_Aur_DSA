
// prerequisite is sorted arrays.
public class BinarySearch {

    public static int Binary_Search(int numbers[], int key){
        int start = 0;
        int end = numbers.length -1;
        
        while(start <= end){
            int mid = (start + end)/ 2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]> key){
               end = mid  -1;
            }
            else{
               start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int result = Binary_Search(numbers, key);
        if(result == -1){
            System.out.println("Given key is not present in the given array!");
        }
        else{
            System.out.println("Given key is present at index: "+ result);
        }

    }
}
