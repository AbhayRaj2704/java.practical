class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        total=numBottles

        while numBottles >=numExchange:
            a=numBottles//numExchange
            total+=a

            numBottles=a+(numBottles%numExchange)

        return total