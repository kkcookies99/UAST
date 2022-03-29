 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        sorted_nums = sorted(nums) # 升序排列
        len_nums = len(nums)
        res_list = []
        for key,value in enumerate(sorted_nums):
            if value > 0: # 最小值大于 0 剩下元素不存在符合条件的元素
                break
            i,j = key + 1, len_nums - 1 # 从下一位和最后一位向中间遍历
            while i < j:
                if sorted_nums[i] + sorted_nums[j] + value == 0:
                    if [value, sorted_nums[i],sorted_nums[j]] not in res_list: # 去重
                        res_list.append([value, sorted_nums[i],sorted_nums[j]])
                    while i < j and sorted_nums[i] == sorted_nums[i+1]: # 去重
                        i += 1
                    while i < j and sorted_nums[j] == sorted_nums[j-1]: # 去重
                        j -= 1
                    # == 0 时,两个指针向中间移动
                    i += 1
                    j -= 1
                # 大于 0, 右指针向中间移动
                elif sorted_nums[i] + sorted_nums[j] + value > 0:
                    j -= 1
                # 小于 0,左指针向中间移动
                else:
                    i += 1
        return res_list

