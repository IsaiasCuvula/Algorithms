public class  InsertionSort {

   public static void main(String[] args) {

      int[] array = {8,223,12,15,2,3,1,9,789, 200,360,450, 89, 65, 78, 98, 45,23,17};
      insertionSort(array);

      for(int i: array){
            System.out.print(i + " ");
      }
    }

    private static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1]= array [j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    
}