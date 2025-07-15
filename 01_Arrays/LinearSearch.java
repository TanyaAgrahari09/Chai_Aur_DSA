
// Time Complexity : O(n), where n is the number of elements in the array.

import java.util.*;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {9,4,5,2,0,2};
        int key = 9;
        int result = linearSearch(numbers, key);
        if(result == -1){
            System.out.println("Given key is not present in the array!");
        }else{
            System.out.println("Given key is present aat index: " + result);
        }
    }
}
