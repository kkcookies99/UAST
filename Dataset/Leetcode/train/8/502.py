 class Solution:
    def XXX(self, s: str) -> int:
        s = s.strip()
        if len(s)==1 and s.isdecimal():
            return int(s)
        elif len(s)==1 or s == '':
            return 0
        res,res_ = '',''
        n,w = 0,1
        for j,i in enumerate(s):
            res += i
            # 开始检测，若为数字，关闭阀门2，开启阀门1
            if res.isdecimal():
                n = 1
                w = 0
            if j != len(s)-1:
                # 若遇到非数字字符串，剔除后跳出循环
                if n and not res.isdecimal(): # 阀门1
                    res = res.replace(i,'')
                    res = res_ + res
                    break
                # 开始检测，若检测到满足的条件为: 写入的字符串是以'-'结尾，且下一位字符串是数字
                if res.endswith('-') and s[j+1].isdecimal():
                    res = ''
                    res_ = i
                    n = 1
                    w = 0
                # 开始检测，若检测到满足的条件为: 写入的字符串是以'+'结尾，且下一位字符串是数字
                if res.endswith('+') and s[j + 1].isdecimal():
                    res = ''
                    res_ = i
                    n = 1
                    w = 0
                # 开始检测，非 "+、-、数字" 字符串，返回0
                if w and not res.isdecimal(): # 阀门2
                    return 0
            elif j == len(s) - 1 and res.isdecimal():
                res = res_ + res
            elif j == len(s) - 1 and not res.isdecimal():
                res = res_ + res[:-1]
        # 范围判断
        if int(res) >= 0:
            return int(res) if int(res) <= 2**31-1 else 2**31-1
        if int(res) <= 0:
            return int(res) if int(res) >= -2**31 else -2**31

