

public class ExLinearSearch {
    public static void main(String[] args) throws Exception {

        int[] array = {15,2,3,0,9,8,789,223,12,3,1,3,12};
        int index = linearSearch(array, 5);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }


    private static int linearSearch(int[] array, int value){

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
