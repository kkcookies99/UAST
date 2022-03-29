 class Solution:
    def XXX(self, s: str) -> str:
        if not s:
            return ""
        max_len = 1
        n = len(s)
        start = 0
        for i in range(1,n):
            even = s[i-max_len:i+1]
            odd = s[i - max_len-1:i+1]
            #print(even,odd)
            if i - max_len - 1 >= 0 and odd == odd[::-1]:
                start = i - max_len - 1
                max_len += 2
            elif i - max_len >=0 and even == even[::-1]:
                start = i - max_len
                max_len += 1
                
        #print(start,max_len)
        return s[start: start+max_len]

