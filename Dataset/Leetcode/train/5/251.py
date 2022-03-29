 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        longest_len = 1
        start_index = 0
        end_index = 0
        # 处理奇数
        for i in range(len(s)):
            temp_len = 1
            for j in range(1, len(s) - i):
                if i - j < 0:
                    break
                elif i + j >= len(s):
                    break
                elif s[i - j] == s[i + j]:
                    temp_len += 2
                    if longest_len < temp_len:
                        longest_len = temp_len
                        start_index = i - j
                        end_index = i + j
                else:
                    break
        # 处理偶数
        for i in range(len(s)):
            temp_len = 1
            if i == len(s) - 1:
                break
            if s[i] != s[i + 1]:
                continue
            else:
                temp_len += 1
                if longest_len < temp_len:
                    longest_len = temp_len
                    start_index = i
                    end_index = i + 1
                for j in range(1, len(s)):
                    if i - j < 0:
                        break
                    elif i + 1 + j >= len(s):
                        break
                    elif s[i - j] == s[i + 1 + j]:
                        temp_len += 2
                        if longest_len < temp_len:
                            longest_len = temp_len
                            start_index = i - j
                            end_index = i + j + 1
                    else:
                        break
        if longest_len > 1:
            return s[start_index:end_index+1]
        else:
            return s[0]

