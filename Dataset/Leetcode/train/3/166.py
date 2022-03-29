 class Solution:
    def XXX(self, s: str) -> int:
        len_max = 0
        # 字符串不为空
        if s:
            str_max = ''
            for i in range(len(s)-1):
                str_max += s[i]
                for j in s[i+1:]:
                    if j not in str_max:
                        str_max += j
                    else:
                        break
                if len(str_max)>len_max:
                    len_max = len(str_max)
                # 如果最大值已经超过剩下的元素数量，跳出循环
                if len_max=>len(s)-i:
                    break
                str_max = ''
        return len_max

