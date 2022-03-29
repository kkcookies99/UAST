 class Solution:
    def XXX(self, s: str) -> int:
        m = 0

        def max(x, y):
            return x if x>y else y
        # 滑窗
        left = 0
        right = 0

        i = 0

        # 右指针始终右移查找，当找到重复字符时，更新左指针到重复处
        while(left<=right and right<len(s)):
            i = s[left:right].find(s[right])
            if i>=0:              
                left = left + i + 1  
            right += 1
            # m记录最大长度
            m = max(m, right-left)

        return m 

