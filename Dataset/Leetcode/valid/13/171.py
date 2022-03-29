class Solution:
    def XXX(self, s: str) -> int:
        map={"I":1,
             "V":5,
             "X":10,
             "L":50,
             "C":100,
             "D":500,
             "M":1000
            
        }
        mid=[]
        if s is None:
            return ""
        
        res=0
      
            
        for i in range(0,len(s)-1):
    

            if map[s[i]] < map[s[i+1]]:
                
                res=res-map[s[i]]
            else:

                    res=res+map[s[i]]
           
        return res+map[s[-1]] 
                
            
       

