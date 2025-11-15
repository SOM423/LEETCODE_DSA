class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] pp = new int[nums.length];
        //base case 
        if(nums.length ==0 || nums == null)
        {
            return null;
        }

        //computing product of left to i
        pp[0] = 1;

        for(int i=1;i<nums.length;i++)
        {
            pp[i] = pp[i-1] * nums [i-1];
        }

        //computing product to right of arraay and multiplying with left
        int rightprod = 1;
        for(int i= nums.length-1 ;i>=0;i--)
        {
            pp[i] = pp[i] * rightprod;
            rightprod = rightprod * nums[i];
         }

         return pp;
    }
}