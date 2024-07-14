public class QuickSort {
    public static void main(String[] args) {
      int[] array = {8,23,12,15,2,3,1,9,89, 75,36,450, 89, 65, 78, 98, 45,83,17};
        
      quickSort(array, 0, array.length - 1);
      for (int i : array) {
        System.out.print(i + " ");
      }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return; //base case
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1; //location of the pivot

        for(int j = start; j <= end; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }

}
