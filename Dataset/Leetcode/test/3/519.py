 class Solution:
    def XXX(self, s: str) -> int:
        if len(s) == 0:
            return 0
        else: 
            max_len_of_substr = 1
            for i, ith_s in enumerate(s):
                a_dict = {}
                flag = True
                for j in range(i, len(s)):
                    if a_dict.get(s[j]) is None:
                        a_dict[s[j]] = j
                    else:
                        flag = False
                        break
                if flag and j == len(s)-1:
                    j+=1
                if j-i>max_len_of_substr:
                    max_len_of_substr = j-i
            return max_len_of_substr

