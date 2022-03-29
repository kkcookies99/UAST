 class Solution:
    def XXX(self, s: str) -> str:
        if len(s) == 1:
            return s[0]
        

        def is_sub(string,i,j):
            while 0 <= i and j < len(s):
                if string[i] != string[j]:
                    break
                i -= 1
                j += 1
            
            return [i+1,j-1]
        
        max_sub = [0,0]
        for i in range(1,len(s)):
            odd = is_sub(s,i-1,i+1)
            even = is_sub(s,i-1,i)

            current = odd if odd[1] - odd[0] > even[1] - even[0] else even
            max_sub = current if current[1] - current[0] > max_sub[1] - max_sub[0] else max_sub

        return s[max_sub[0] : max_sub[1]+1]

