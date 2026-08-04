class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        cnt=0
        for i in nums:
            digit=len(str(i))

            if digit %2==0:
                cnt+=1

        return cnt
            


        