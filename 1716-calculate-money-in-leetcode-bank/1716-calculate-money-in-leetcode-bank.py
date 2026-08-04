class Solution:
    def totalMoney(self, n: int) -> int:
        
        start=1
        total=0

        for i in range(n):
            day=i%7
            total+=start+day  

            if day==6:
                start+=1

        return total      
            
        

        