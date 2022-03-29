 def find(self,s,l,r):   #l是起始节点，r是终止节点
    
    while l >= 0 and r < len(s) and s[l] == s[r]:
        l -= 1
        r += 1
    
    return s[l+1:r]
    
    
    
def XXX(self, s):
    """
    :type s: str
    :rtype: str
    """
    start = end = 0
    
    max_str = ''
    for i in range(len(s)):
        str1 = self.find(s,i,i)
        str2 = self.find(s,i,i+1)
        cur = str1 if len(str1) > len(str2) else str2
        max_str = cur if len(cur) > len(max_str) else max_str
    
    return max_str

