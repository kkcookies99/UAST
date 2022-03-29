 class Solution(object):
    def judeRange(self, c):
        if c >= 'a' and c <= 'z':
            return True
        elif c >= 'A' and c <= 'Z':
            return True
        elif c >='0' and c <= '9':
            return True
        else:
            return False

    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        核心思想:
            双向指针，自动去除出字母和数字之外的字符串
            统一将字母转换为小写
        """
        if len(s) == 0:
            return True
        start = 0
        ends = len(s)-1

        while start < ends:
            flag1 = self.judeRange(s[start])
            flag2 = self.judeRange(s[ends])
            if flag1 and flag2:
                s1 = s[start].lower()
                s2 = s[ends].lower()
                if s1 != s2:
                    return False
                start += 1
                ends -= 1
                continue
            elif flag1 and ~flag2:
                ends -= 1
                continue
            elif ~flag1 and flag2:
                start += 1
                continue
            else:
                start += 1
                ends -= 1
        return True

