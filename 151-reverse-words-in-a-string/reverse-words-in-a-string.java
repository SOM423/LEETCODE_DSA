class Solution {
    public String reverseWords(String s) {

        String output = "";
        
        String[] str = s.trim().split("\\s+");

        for(int i=str.length-1;i> 0;i--)
        {
            output += str[i] +" ";
        }

        return output + str[0];
    }
}