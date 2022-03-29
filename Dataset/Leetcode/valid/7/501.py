 class Solution:
    def XXX(self, x: int) -> int:
        # 转换成字符串在进行翻转生成列表再拼成字符串
        XXX_str = ''.join(list(XXXd(str(x))))
        # 如果为-，切掉最后的-符号，然后再将字符串转成int输出
        if '-' in XXX_str:
            res = int(XXX_str[:-1])*-1
        else:
            res = int(XXX_str)
        # 用If判断，不过感觉更好的方法是用try语句
        if res >(2**31-1) or res < (-2)**31:
            return 0
        else: 
            return res
        

