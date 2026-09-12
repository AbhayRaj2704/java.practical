class Solution {
    public static boolean rev(int i, String s){
        if (i>=s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return rev(i+1,s);
    }
    public boolean isPalindrome(String s) {
         s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return rev(0,s);
       
     
    }
}