class Solution:
    def checkRecord(self, s: str) -> bool:
    
        abse=s.count('A')
        
        late=s.count('L')

        if abse>=2:
            return False
        
        if late>=3:
            if "LLL" in s:
                return False

        return True
            


        