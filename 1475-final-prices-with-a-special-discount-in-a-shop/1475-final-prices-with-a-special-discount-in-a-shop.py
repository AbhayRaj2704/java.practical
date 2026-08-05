class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        l=[]
        for i in range(len(prices)):
            price=prices[i]
            
            for j in range(i+1, len(prices)):
                if prices[j]<=price:
                    price=price-prices[j]
                    break

            l.append(price)

        
        return l