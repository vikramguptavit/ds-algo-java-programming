public class Main {

    public static void main(String[] args) {
        int arr[]={2,8,7,1,3,5,6,4};
        System.out.println("=============Before sorting==============");
        for (int i=0;i<arr.length;i++){
            System.out.print(" ["+arr[i]+"] ");
        }
        System.out.println();
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("=============After sorting===============");
        for (int i=0;i<arr.length;i++){
            System.out.print(" ["+arr[i]+"] ");
        }
    }

}
