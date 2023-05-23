package javaCode;

public class Sorting{
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("in i");
            int minEle = arr[i];
            int minIndex = i; 
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("in J");
                if(minEle > arr[j]){
                    minEle = arr[j];
                    minIndex = j;
                }
            }
            // swap minEle with Ith ele
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    // n*(n+1)/2 = n^2/2 + n/2

    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("In i");
            for (int j = 0; j < arr.length-i-1; j++) {
                System.out.println("in J");
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimize(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            // System.out.println("in I");
            boolean sorted = true;
            for (int j = 0; j < arr.length-i-1; j++) {
                // 1,2,3,4,5
                // System.out.println("in j");
                if(arr[j] > arr[j+1]){
                    sorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(sorted){
                break;
            }
        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >=0 && arr[j] >key) {
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        // int arr[] = {1,2,3,4,5};
        // selectionSort(arr);

        // bubbleSortOptimize(arr);
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}