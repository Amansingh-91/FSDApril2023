package javaCode;



public class SearchAssignment {
    public static int search(int arr[], int low, int high){
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == mid){
                return mid;
            }
            else if(arr[mid] > mid){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return -1;
    }
    public static int search2(int arr[], int low){
        
        while(low >0){
            try{if(arr[low] == low){
                return low;
            }
            low++;}
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Not_Found");
                return -1;
            }
        }

        return -1;
    }
    public static int search3(int arr[], int low){
        int high = low;
        while(low <= high){
            int mid = (low + high)/2;
            try{
                
                
                if(arr[mid] == mid){
                    return mid;
                }
                else if(arr[mid] > mid){
                    high = mid -1;
                }
                else{
                    low = mid+1;
                    high = high *2;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(mid + " " + high);
                high = mid -1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={-3,0,1,2,3,4,5,7};
        System.out.println(search(arr, 1, arr.length-1));
        System.out.println(search2(arr, 1));
        System.out.println(search3(arr, 1));
    }
}
