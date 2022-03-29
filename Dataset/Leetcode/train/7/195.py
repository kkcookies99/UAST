class Solution:
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x>=0:    # 如果是正整数
            x = str(x)  # 转化成字符串
            x = x[::-1] # 反转
        else:   # 如果是负整数
            x = str(x)  # 转化成字符串
            x = x[1:]   # 去掉负号
            x = '-'+x[::-1] # 反转并拼接负号
        x = float(x)    # 转化成float格式
        if (x < float(-2 << 30)) | (x >= float(2 << 30)):   # 如果反转后位数溢出了则返回0
            return 0
        x = int(x)  # 转换成int类型
        return x