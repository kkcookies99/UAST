 class Solution:
    """
    first time:
    total time:
    time complexity:O(m+n)
    space complexity:O(m+n)
    idea:KMP算法。将needle字符串、"#"、haystack字符串连接组成新的字符串s，利用kmp算法记录下needle字符串的所有位置的前缀函数值，迭代s中haystack部分字符串，依次计算每个位置的前缀函数值，但不用记录下来，只需用一个临时变量记下上一个位置的前缀函数值即可，直到找到某个位置的前缀函数值为m，停止迭代，利用停止迭代的下标值可以计算出needle字符串第一次在haystack中出现的位置。
    """
    def XXX(self, haystack: str, needle: str) -> int:
        if needle=="": 
            return 0
        m=len(needle)
        n=len(haystack)
        
        #记录needle字符串中各位置的前缀函数值
        pi=[0]
        j=0
        for i in range(1,m):
            while j>0 and needle[i]!=needle[j]:
                j=pi[j-1]
            if needle[i]==needle[j]:
                j+=1
            pi.append(j)
        
        #迭代s中的haystack部分字符串，找到某个位置的前缀函数值为m，则停止迭代
        j=0
        for i in range(0,n):
            while j>0 and haystack[i]!=needle[j]:
                j=pi[j-1]
            if haystack[i]==needle[j]:
                j+=1
            if j==m:
                return i-m+1
        return -1

