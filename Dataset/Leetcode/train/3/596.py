 class Solution:
    def XXX(self, s: str) -> int:
        tmp_list = [] 
        max_len = 0 
        for i in range(len(s)): 
            if s[i] not in tmp_list: 
                tmp_list.append(s[i])
            else: 
                if max_len < len(tmp_list): max_len = len(tmp_list)
                ind = tmp_list.index(s[i]) 
                tmp_list = tmp_list[ind+1:]
                tmp_list.append(s[i])
            if i == len(s) - 1: 
                if max_len < len(tmp_list): max_len = len(tmp_list)

        return max_len 

