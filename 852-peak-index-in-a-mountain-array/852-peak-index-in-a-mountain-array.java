class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length<3)return -1;
        int left=0,right=arr.length-1;
        while(left<=right) {
            int mid=(right+left)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])return mid;
            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return -1;
    }
}