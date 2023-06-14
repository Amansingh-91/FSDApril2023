package javaCode;

import java.util.Random;

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

    
    public static void insertionSortDecs(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >=0 && arr[j] <key) {
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1] = key;
        }
    }
    public static void quickSort(int arr[],int low,int high){
        if(low >= high){
            return;
        }
        Random r = new Random();
        int eleIndex = r.nextInt(high-low) + low;
        int temp = arr[eleIndex];
        arr[eleIndex] = arr[high];
        arr[high] = temp;
        int pivot = partation(arr,low,high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
    }
    public static int partation(int arr[],int low, int high){
        int pivotEle =  arr[high];
        int j = low;
        for (int i = low; i < high; i++) {
            if(arr[i] < pivotEle){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        int temp = arr[j];
        arr[j] = arr[high];
        arr[high] = temp;
        return j;

    }

    public static void mergeSort(int arr[],int low, int high){
        if(low < high){
            int mid = (high - low)/2 + low;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low,mid,high);
        }
    }
    public static void merge(int arr[], int low, int mid, int high){
        // size of left sub array
        int n1 = mid - low + 1;  // 0 1 2 3 4 5
        // size of right sub array
        int n2 = high - mid;
        // new array for merging the sorted array
        int result[] = new int[n1+n2];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }
        // starting of left sub array
        int i = low;
        // starting of right sub array
        int j = mid + 1;
        // starting of result array
        int k = 0;
        while (i <= mid && j <= high) {
            if(arr[i] < arr[j] ){
                result[k] = arr[i];
                i++;
            }
            else{
                result[k] = arr[j];
                j++;
            }
            k++;
        }

        // to move remaining left sub array elements
        while (i <= mid) {
            result[k] = arr[i];
            i++;
            k++;
        }

        // to move remaining right sub array elements
        while (j <= high) {
            result[k] = arr[j];
            j++;
            k++;
        }

        // copy the elements from result array to your actual array
        for (int k2 = 0; k2 < result.length; k2++) {
            arr[k2 + low] = result[k2];
        }

    }
    
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        // int arr[] = {1,2,3,4,5};
        // selectionSort(arr);

        // bubbleSortOptimize(arr);
        // insertionSort(arr);
        // insertionSortDecs(arr);
        // quickSort(arr, 0, 4);
        mergeSort(arr, 0, 4);
        // Random r = new Random();
        // int high = 14;
        // int low = 3;
        // int eleIndex = r.nextInt(high-low) + low;
        // System.out.println(eleIndex);
        printArr(arr);
        System.out.println();
    }
}