 class Solution:
    """
    first time:85min  
    total time:85min
    time complexity:O(mn)
    space complexity:O(n)
    idea:
    """
    def XXX(self, strs: List[str]) -> str:
        str1=strs[0]
        for e in strs:
            if len(e)<len(str1): str1=e
        m=len(str1)

        foreStr1=[]
        for i in range(m,0,-1):
            foreStr1.append(str1[0:i])

        k=0
        comForeStr=""
        while k<len(foreStr1):
            comForeStr=foreStr1[k]
            for e in strs:
                if e[0:len(comForeStr)]!=comForeStr: 
                    comForeStr=""
                    break
            if comForeStr!="": break
            k+=1
        return comForeStr

            
            
            



