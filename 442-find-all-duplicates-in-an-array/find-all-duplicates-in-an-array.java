class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        
        List<Integer> duplicates = new ArrayList<Integer>();
        
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            int index = Math.abs(arr[i]) -1;

            if(arr[index] < 0)
            {
                duplicates.add(index+1);
                
            }
            else
            {
                arr[index] = -arr[index];
            }
        }

        return duplicates;
    }
}