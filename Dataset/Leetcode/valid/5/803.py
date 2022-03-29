 class Solution:
    def XXX(self, s: str) -> str:
        #马拉车算法  这是人想出来的？
        #预处理，用|填充字符串，确保字符串长度为奇数
        s1 = '|'
        for i in range(len(s)):
            s1 =s1 + s[i] + '|'
        max_item = 0
        max_len = 0
        # p[i]表示以位置i 为中心的的最长回文串的半径    
        p = [0 for i in range(len(s1))]
        c = r =0   # c为中心点，r为右边界
        for i in range(1,len(s1)):
            if i<r:                         #当i<r 时，相当于目前子串有部分与当前所在回文字段重叠，直接选取其中一段的值
                p[i] = min(p[2*c-i],r-i)
            left = i - p[i] - 1             #跳过已判定过为回文的段，再做中心扩展
            right = i + p[i] + 1
            while left>=0 and right<=len(s1)-1 and s1[left]==s1[right]: # 以i为中心扩展寻找最长回文串
                left -= 1
                right += 1
            left += 1
            right -= 1
            if right<r and i<r:
                p[i] = p[2*c-i]
            elif right>r:             # 当最右边界超过r时，重新赋值，相当于将区间往右移动，降低后续重复计算的可能性
                c = i
                r = right
                p[i] = right - i
            if p[i] > max_len:
                max_len = p[i]
                max_item = i
        s2 = ''
        for i in s1[max_item - max_len:max_item + max_len + 1]:
            if  i!='|':
                s2 += i
        return(s2)

