 class Solution:
    def XXX(self, s: str) -> bool:
        i,j = 0,len(s)-1
        flag = True
        while i<j:
            rang = [chr(ord('a')+k) for k in range(26)]+ [chr(ord('A')+k) for k in range(26)]+[chr(ord('0')+k) for k in range(10)]
            if s[i] not in rang:                    
                i+=1
                flag = False
            if s[j]not in rang:               
                j-=1
                flag = False          
            if flag:                
                if s[i].upper() != s[j].upper():
                    return False
                else:
                    i+=1
                    j-=1
            flag = True
        return True

