 class Solution:
    def XXX(self, s: str) -> bool:
        l = 0  
        r = len(s)-1 
        s =s.lower() 
        while l<=r: 
            while l<=r and not (ord('a')<=ord(s[l])<=ord('z') or ord('0')<=ord(s[l])<=ord('9')):
                l+=1 
            while l<=r and not (ord('a')<=ord(s[r])<=ord('z') or ord('0')<=ord(s[r])<=ord('9')):
                r-=1 
            # print(l,r)
            if l<=r :
                if s[l]!=s[r]:
                    return False 
                l+=1 
                r-=1 
            else:
                return True  
        return True   

