class Solution:
    def XXX(self, s: str) -> int:

        # 1. 去除两端所有空格
        s = s.strip()

        # 2. 根据提示，判断是否有效转换，无效返回0
        if not s or not s[0].isdigit() and s[0] not in ["-","+"]:
            return 0

        # 3. 预设结果串
        result = ""

        # 4. 遍历字符串
        for i in range(len(s)):
            # 5. 判断第一个元素是否“-”、“+”号
            if i == 0 and s[i]== "-":
                result = "-"
                continue
            elif i == 0 and s[i] == "+":
                result = ""
                continue
            # 6. 从第二个元素开始判断，如果是数字，则加入结果串
            if s[i].isdigit():
                result += s[i]
            else:
                break
        
        # 7. 防止结果只有一个符号或者空
        if result in ["-","+",""]:
            return 0

        # 8. 判断越界
        if int(result) > 2**31 - 1:
            return 2**31 - 1
        elif int(result) < -2**31:
            return -2**31
        
        return int(result)

