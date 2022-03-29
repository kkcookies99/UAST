 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        if len(nums) == 1:
            return True
        if nums[0] == 0:
            return False

        # O(n) 贪心，设置flag，基于能不能跨跃0来考虑
        zero_idx = -1
        nums[-1] = 1
        flag = True
        for i in range(len(nums)-2, -1,-1):
            if nums[i] == 0 and nums[i+1]!= 0:#考虑到连续的0
                if flag == False:#无法跨越时，仍然考虑最后一个0，否则考虑到前面的0
                    continue
                flag = False
                zero_idx = i
            if nums[i] > 0:
                if nums[i] + i > zero_idx:
                    # print(i,nums[i],zero_idx)
                    flag = True
        
        return flag

