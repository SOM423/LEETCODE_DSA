class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int x = 0;
        int y = 0;
        String res = "";

        while(x < word1.length() && y < word2.length())
        {
            res = res + word1.charAt(x) + word2.charAt(y);
            x++;
            y++;
        }

        while(x < word1.length())
        {
             res = res + word1.charAt(x);
             x++;
        }

         while(y < word2.length())
        {
             res = res + word2.charAt(y);
             y++;
        }

        return res;
    }
}