package BinarySearch;
public class BinarySearch{
static int binarySearching(int arr[],int target){
   int n = arr.length;
   int st = 0;
   int end = n-1;
   int fo = -1;
   while(st<=end){
    int mid = (st+end)/2;
    if(target ==arr[mid]){
       fo = mid;
    //    end = mid-1;   //used for first occurance 
    st = mid+1; // for last occurance
    }
    else if(target <arr[mid]){
        end = mid-1;
    }
    else{
        st = mid +1;
    }
   }
   return fo;
}
//  static boolean recBS(int arr[] ,int st, int end,  int target){
//     if(st>end){
//         return false;}
//     int mid = (st+end)/2;
//     if(target ==arr[mid]){
//         return true;
//     }
//     else if(target <arr[mid]){
//         return recBS(arr, st, mid-1, target);
//     }
//     else{
//         return recBS(arr, mid+1, end, target);
//     }
// }
    
public static void main(String[] args) {
    int arr[] = {4,4,4,5,5,7,8,8};
    int target = 4;
System.out.println(binarySearching(arr, target));
// System.out.println(recBS(arr, 0, arr.length-1, target));
 }
}