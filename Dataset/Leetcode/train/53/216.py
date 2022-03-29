class Solution:
    def XXX(self, nums: List[int]) -> int:
        if nums:
            sum = 0
            max_sum = 0
            flag=False#判断是不是都是负数
            for num in nums:
                sum += num
                if sum <= 0:
                    sum = 0
                else:
                    flag=True#只要能进到这个分支，则表明至少有一个数不是负数
                    if max_sum < sum:
                        max_sum = sum
            if flag:
                return max_sum
            else:#如果都是负数，则输出最小的负数
                return max(nums)
        else:
            return 0

