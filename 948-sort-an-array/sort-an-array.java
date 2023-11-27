class Solution {
    public int[] sortArray(int[] nums) {
    int l=0;
    int h = nums.length -1;
    mergeSort(nums,l,h);

    return nums;
        
    }

    public static void mergeSort(int[] a,int l, int h)
    {
        if(l < h)       // Base condition IMP else will get Stack Overflow .....
        {
         int m = (l+h)/2;

        //Logic for Devide and Conquer
        mergeSort(a,l,m);        //Left Half
        mergeSort(a,m+1,h);     //Right Half
        merge(a,l,m,h);
        }
    }

    public static void merge(int[] a,int l,int m,int h)
    {
        //First we need left and Right array 
        int n1 = m-l+1  ;
        int n2 = h-m  ;

        int LA[] = new int[n1];
        int RA[] = new int[n2];

        //Take left array elemenmts from original array
        for(int i=0;i<n1;i++)
        {
            LA[i] = a[l+i];
        }

        //Take Right Array elements From Original Array.
        for(int j=0;j<n2; j++)
        {
            RA[j] = a[m+1+j];
        }

        //Two Way Merging 

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2)
        {
            if(LA[i] < RA[j])
            {
                a[k] = LA[i];
                i++;
                k++;
            }
            else
            {
                a[k] = RA[j];
                j++;
                k++;
            }
        }

        //Remaining elements from 1st array
        while(i<n1)
        {
            a[k] = LA[i];
            i++;
            k++;
        }

        //Remaining elements from 2nd array
        while(j<n2)
        {
            a[k] = RA[j];
            j++;
            k++;
        }

    }
}