import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) throws Exception {

        int[] array = new int[1000000];
        int target = 779989;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        //************ Using built-in Arrays.binarySearch **************
        int index = Arrays.binarySearch(array, target);

        if(index == -1){
            System.out.println("Element not found");
        }else {  
            System.out.println("Element found at: " + index + " position");
        }
        System.out.println("**********************************");
        //***************** Using Custom binarySearch **************
        binarySearch(array, target);
    }


    private static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high -low)/2;
            int value = array[middle];

            System.out.println("middle: " + middle);

            if(value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle; // target found    
            
        }
        return -1;
    }
}
