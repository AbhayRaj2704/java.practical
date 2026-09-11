class Solution { 
    public int reverse(int x) { 
        int rev = 0; 
        while(x != 0){ 
            int digit = x % 10; 
            long temp = (long)rev * 10 + digit;
            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
                return 0;
            }
            rev = (int)temp; 
            x /= 10; 
        } 

        return rev; 
    } 
}