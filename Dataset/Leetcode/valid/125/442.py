 class Solution:
    def XXX(self, s: str) -> bool:
        new_list = []
        for i in range(len(s)):
            if ord(s[i]) in range(65,91):
                new_list.append(chr(ord(s[i])+32))
            elif ord(s[i]) in range(97,123) or ord(s[i]) in range(48,58): 
                new_list.append(s[i])
        return new_list == new_list[::-1] 

