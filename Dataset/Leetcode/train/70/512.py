class Solution:
    def XXX(self, n: int) -> int:
        # 首先求出到达顶楼时，步长为2最大次数
        step_2_max = n//2
        # cnt表示爬到顶楼的方法种类
        cnt = 0

        for i in range(step_2_max+1):
            if i==0:
                cnt = 1
            else:
                # i个步长为二的情况下，步长为1的个数为step_1_num
                step_1_num = n - i*2
                # 步长为2的个数 step_2_num
                step_2_num = i
                # 共有step_sum步到达山顶
                step_sum = step_1_num + step_2_num
                # 当前步长为2的个数下，求出排列组合数 Cnm = n!/(m! * (n-m)!)
                cnt += math.factorial(step_sum)/(math.factorial(step_2_num) * math.factorial(step_sum-step_2_num))

        return int(cnt)

