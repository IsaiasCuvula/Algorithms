public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {789,223,12,15,2,3,1,9,8, 200,300,450, 89, 65, 78, 98, 45,23,17};
        
        bubbleSort(array);

        for(int i: array){
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1]= temp;
                }
            }
        }
    }
}
