class Solution {
    public int search(int[] nums, int target) {

        int l=0;
        int h = nums.length -1;

        return BinarySearch(nums,l,h,target);
        
    }

    public static int BinarySearch(int[] arr, int l, int h, int ele)
    {
        if(l<=h)
        {
            // Find the middle index
            int m = l + (h -l)/2;

            if(arr[m] == ele)
            {
                return m;
            }
            else if(ele > arr[m])
            {
                return BinarySearch(arr,m+1,h,ele);
            }
            else
            {
                return BinarySearch(arr,l,m-1,ele);
            }
        }
        return -1;
    }
}