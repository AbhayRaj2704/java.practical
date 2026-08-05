class Solution:
    def minimumSum(self, num: int) -> int:

        digit=sorted(str(num))

        return int(digit[0]+digit[2])+int(digit[1]+digit[3])