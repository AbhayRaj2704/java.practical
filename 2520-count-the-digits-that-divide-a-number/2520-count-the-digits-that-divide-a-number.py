class Solution:
    def countDigits(self, num: int) -> int:
        cnt=0
        org=num
        while num!=0:
            digit=num%10
            if org %digit==0:
                cnt+=1
            num=num//10
        return cnt
        
        