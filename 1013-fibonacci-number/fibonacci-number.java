class Solution {
    static int sum =0;
    static Map<String,Integer> map = new HashMap<>();
    static int fib(int n){
        
        return fibo(n);
    }
    
    
    public static int fibo(int n)
    {
        if(map.containsKey("f"+n))
        {
            return map.get("f"+n);
        }
        
        if(n == 0 || n == 1)
        {
            map.put("f"+n,n);
            return n;
        }
        else
        {
            sum = fibo(n-1) + fibo(n-2);
            map.put("f"+n,sum);
            return sum;
        }
    }
}