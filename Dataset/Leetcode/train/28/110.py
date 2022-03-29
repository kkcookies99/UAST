 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        def get(s : str)->List:
            n = len(s)
            ret = [0]*n
            t=0 
            for i in range(1,n):

                # 最关键的部分就是这个while
                # t在循环开始时是 s[0 ... i-1]这个串的 前缀等后缀 的长度
                # 所以应当拿s[t] (下标从0开始) 与s[i]比较 
                # 如果相等 退出循环 ,那么s[0 ... i] 的前缀等后缀长度为 t+1
                # 如果不等, 就找s[0 ... t-1]这个串的 前缀等后缀 的长度(即ret[t-1]),  然后继续比较
                # ret[i]就表示的是s[0...i]这个串 前缀等后缀 的长度 把ret打印出来就可明白
                while t > 0 and s[t] != s[i]:
                    t = ret[t-1]
                if s[t] == s[i]: 
                    t += 1
                ret[i] = t # t表示遍历到当前位置时 前缀等于后缀的长度
            print(ret) # "aabbaa" 对应 [0 1 0 0 1 2]
            return ret
        if not needle:
            return 0
        nxt=get(needle)

        t=0 # 这里的t表示当前已经匹配的字符个数,整个匹配过程与上面类似
        for i in range(len(haystack)):
            #与上面的分析类似
            while t > 0 and haystack[i] != needle[t]:
                t=nxt[t-1]
            if haystack[i] == needle[t]:
                t += 1
            if t == len(needle):
                # 如果这里想找到所有的匹配位置  t=0 即可
                return i-t+1
                
        return -1

