import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int m=0;
        int cnt=0;
        for(int x: nums){
            if (cnt==0){
                m=x;
                cnt=1;
            }
            else{
                if(m==x){
                    cnt+=1;
                }
                else{
                    cnt-=1;
                }
            }
        }
        return m;
    
}
}