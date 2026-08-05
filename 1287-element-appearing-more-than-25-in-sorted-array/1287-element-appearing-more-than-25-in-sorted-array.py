class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        arr=sorted(arr)
        cnt=1

        for i in range(1,len(arr)):
            if arr[i]==arr[i-1]:
                cnt+=1
            else:
                cnt=1
        
            if cnt*4> len(arr):
                return arr[i]
        return arr[0]
        