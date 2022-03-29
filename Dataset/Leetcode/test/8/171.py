class Solution:
    def XXX(self, str: str) -> int:
        i = 0
        N = len(str)
        
        # 丢弃空白字符
        while i < N and str[i] == ' ':
            i += 1
            
        # 保存正负号
        isNeg = False
        if i < N and str[i] in ['-', '+']:
            isNeg = str[i] == '-'
            i += 1
        
        # 处理数字
        ret = 0
        while i < N and str[i] <= '9' and str[i] >= '0':
            ret = ret * 10 + int(str[i])
            i += 1
            
        # 处理溢出
        INT_MAX = 2 << 30
        if not isNeg:
            INT_MAX -= 1
        
        ret = min(INT_MAX, ret)
        
        return -ret if isNeg else ret

