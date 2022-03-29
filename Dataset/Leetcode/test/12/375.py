 class Solution:
    def XXX(self, num: int) -> str:
        def trans(num, s1, s2, s3):
            # num为0-9的值
            # s1为代表5的字符
            # s2为代表1的字符
            # s3为代表10的字符
            s_num = ""
            if num < 4:
                for i in range(num):
                    s_num += s2
            elif num == 4:
                s_num = s2 + s1
            elif 8 >= num >= 5:
                s_num = s1
                num = num - 5
                for i in range(num):
                    s_num += s2
            elif num == 9:
                s_num = s2 + s3
            return s_num

        # 字符  数值
        # I     1
        # V     5
        # X     10
        # L     50
        # C     100
        # D     500
        # M     1000
        zero_ten = 0
        ten_hun = 0
        hun_thou = 0
        over_thou = 0
        # 开始取值
        if num >= 1000:
            over_thou = num // 1000
            num = num % 1000
        if num >= 100:
            hun_thou = num // 100
            num = num % 100
        if num >= 10:
            ten_hun = num // 10
            num = num % 10
        zero_ten = num
        # 开始转换
        ans = ""
        # 千位
        ans += trans(over_thou, "", "M", "")
        # 百位
        ans += trans(hun_thou, "D", "C", "M")
        # 十位
        ans += trans(ten_hun, "L", "X", "C")
        # 个位
        ans += trans(zero_ten, "V", "I", "X")
        return ans

