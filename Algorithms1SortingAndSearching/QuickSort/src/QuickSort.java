public class QuickSort {
    public static void quickSort(int arr[], int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    public static int partition(int arr[], int low, int high) {

        int pivotElement = arr[high];//Consider element as pivot element
        int i = low - 1;//index for last smaller element than pivot(initially -1)

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivotElement) {
                i++;//inc i as another smaller element than pivot found
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i+1] and arr[high](basically pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
