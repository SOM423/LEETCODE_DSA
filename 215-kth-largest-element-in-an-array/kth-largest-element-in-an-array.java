class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Bubble sort

        // for(int i=0;i<k;i++)
        // {
        //     for(int j=0;j<nums.length-1;j++)
        //     {
        //         if(nums[j] > nums[j+1])
        //         {
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        // return nums[nums.length -k];


        //Solution 2 Priority Queue

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++)
        {
            if(nums[i] > pq.peek())
            {
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
        
    }
}