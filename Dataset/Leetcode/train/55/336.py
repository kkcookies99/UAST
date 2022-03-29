class Solution:
    def XXX(self, nums: List[int]) -> bool:
        # 计算当前需要多大的数字才能接上
        current_zero = 0
        # 标记当前是否断开，若没有0则代表未断开
        have_zero = False
        # 去除最后一个元素
        nums = nums[:-1]
        # 如果当前值为0，则current_zero+1, have_zero改为True，若当前值已经可以接上则将current_zero设为0，同时将have_zero改为False，如果当前断开且没有能力连上，则将current_zero+1
        for i in nums[::-1]:
            if i == 0:
                current_zero += 1
                have_zero = True
            elif have_zero and current_zero<i:
                current_zero = 0
                have_zero = False
            elif have_zero:
                current_zero+=1
            else:
                continue
        if current_zero == 0:
            return True
        else:
            return False

