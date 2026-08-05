class Solution:
    def findGCD(self, nums: List[int]) -> int:
        l=[]
        for i in nums:
            l.append(i)

        l.sort()

        small=l[0]
        large=l[len(nums)-1]
        
        for i in range(1,small+1):
            if small %i==0 and large%i==0:
                gcd= i
        return gcd