class Solution:
    def distributeCandies(self, n: int, limit: int) -> int:
        cnt=0

        for i in range(limit+1):
            for j in range(limit+1):
                k=n-i-j

                if k>=0 and k<=limit:
                    cnt+=1
        
        return cnt