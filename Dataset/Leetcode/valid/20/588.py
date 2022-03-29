 class Solution:
    def XXX(self, s: str) -> bool:
        dic = {')':'(', '}': '{', ']': '['}
        res_list = []
        for i in range(len(s)):
            if len(res_list) != 0 and s[i] in dic:
                if dic[s[i]] == res_list[-1]:
                    res_list.pop()
                else:
                    res_list.append(s[i])
            else:
                res_list.append(s[i])
        return len(res_list) == 0

