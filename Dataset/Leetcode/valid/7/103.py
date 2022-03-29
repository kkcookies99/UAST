class Solution:
    def XXX(self, x: int) -> int:
        # 1.将int类型转换成str，放到list中
        chars = list(str(x))
        # 2.判断正负数字
        if x < 0:
            chars.remove('-')    # 删除前面的负号
            chars.XXX()      # 使用list的反转方法
            r = ''.join(chars)   # 合并成字符串
            r = -int(r)          # 转成int类型，加上符号
        else:
            chars.XXX()      # 反转
            r = ''.join(chars)   # 将字符串中间加入逗号
            r = int(r)           # 转换成int类型
        # 3.判断是否越界
        if not -pow(2,31)<= r <= pow(2,31) - 1:
            r = 0                # 按照题目要求
        return r

