class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] output = new int[arr.length];

        int Leftprod = 1;
        for(int i=0;i<output.length;i++)
        {
            output[i] = Leftprod;
            Leftprod = Leftprod * arr[i];
        }
        int RightProd=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            output[i] = (int)((output[i] * RightProd) %(10e9 + 7));
            RightProd = RightProd * arr[i];
        }

        return output;
    }
}