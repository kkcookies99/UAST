class Solution:
    def XXX(self, n: int) -> str:
        # 假设n为大于0的整数
        output = ""
        # Base case
        if n == 1:
            return "1"
        # Recursive case
        else:
            last = self.XXX(n-1)
            # 对于每个字符c出现的次数，我们用x个c来描述
            x = 1   # 一旦检测到c，至少有1个c，所以x初始为1。为了便于计算，x是int类型，输出时记得转化为str类型
            for i in range(1, len(last)):   # 从第2个字符开始逐个与前一位字符比较
                if last[i-1] == last[i]:    # 如果相同则x+1, 继续比较下一位与当前位
                    x += 1
                else:   # last[i] != last[i-1]
                    output = output + str(x) + last[i-1]    # 如果不同，则输出现有的x个c（=last[i-1]）
                    x = 1   # 开始数新的字符c(=last[i]),将x重设为1
            output = output + str(x) + last[-1] # for循环结束时，再给output加上已计数但未算到结果的末位字符c
            return output

