class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        product=1
        sum=0
        for i in range(len(str(n))):
            digit=n%10
            product= product*digit
            sum=sum+digit
            n=n//10

        return product-sum
