class Solution {
    public int minAddToMakeValid(String s) {
        //without using stack will use two pointers but diff way

        int left =0;
        int right=0;

        int y=0;

        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                left++;
            }
            else
            {
                if(left >0 && c==')')
                {
                    left--;
                }
                else
                {
                    right++;
                }
            }
        }
        return left + right;
    }
}