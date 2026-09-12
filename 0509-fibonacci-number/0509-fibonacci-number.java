class Solution {
    public static int fibbo(int c){
        if(c<=1){
            return c;
        }
        return fibbo(c-1)+fibbo(c-2);
    }
    public int fib(int n) {
        return fibbo(n);
    }
}