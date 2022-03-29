 class Solution:
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        
        same=''
        if len(strs)==0:
            return same
        #找到最小长度的索引
        minIdex=0
        
        for i in range(len(strs)):
            if len(strs[i])<len(strs[minIdex]):
                minIdex=i
        a=True
        for i in range(len(strs[minIdex])):
            if not a:
                break
            for j in range(len(strs)):
                
                if strs[j][i]!=strs[minIdex][i]:
                    a=False
                    break
            
            if a:
                same+=strs[minIdex][i]
        return same

