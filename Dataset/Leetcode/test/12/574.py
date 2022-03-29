 class Solution:
    def XXX(self, num: int) -> str:
        # 先从大到小排序，把每个字符都当做进制编码
        dict = {'M':1000,'CM':900,'D':500,'CD':400,'C':100,'XC':90,'L':50,'XL':40,'X':10,'IX':9,'V':5,'IV':4,'I':1}
        res = ''
        # 用进制的思想来做
        for k,v in dict.items():
            res = res + num // v * k 
            num = num % v
        return res

