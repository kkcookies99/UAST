 class Solution:
    def XXX(self, s: str) -> int:
        # 1024 second coding
        if not s: return 0
        left = 0   #滑动窗口的左侧
        curlen = 1 #把s[0]包含进去
        maxlen = 1
        target = s[0]#目标子串

        for right in range(1,len(s)):#滑动窗口的右侧
            curlen +=1
            while s[right] in target:
                curlen -=1
                left +=1
                target = s[left:right]
            target += s[right]
            maxlen = curlen if curlen>maxlen else maxlen
        return maxlen

