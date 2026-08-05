class Solution:
    def countEven(self, num: int) -> int:
        
        cnt=0
        for i in range (1,num+1):
            x=i
            sum=0

            while x!=0:
                digit=x%10
                sum+=digit
                x=x//10

            
            if sum%2==0:
                cnt+=1
        return cnt

        