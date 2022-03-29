 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        # 去重才是难点
        n = len(nums)
        nums.sort()
        res = []
        # # 枚举中间的数 但是去重复杂度太高了  击败7%
        # for i in range(1, n - 1):
        #     j, k = 0, n - 1
        #     while j < i < k:
        #         if nums[i] + nums[j] + nums[k] > 0:  # 如果大于0，大数调小
        #             k -= 1
        #         else:
        #             if nums[i] + nums[j] + nums[k] == 0 and [nums[i], nums[j], nums[k]] not in res:
        #                 res.append([nums[i], nums[j], nums[k]])
        #             j += 1
        # return res

        #  击败75%
        for i in range(n - 2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:  # 避免重复解
                continue
            j, k = i + 1, n - 1
            while j < k:
                if nums[i] + nums[j] + nums[k] == 0:
                    res.append([nums[i], nums[j], nums[k]])
                    while j < k and nums[j] == nums[j + 1]:  # 避免重复解
                        j = j + 1
                    while j < k and nums[k] == nums[k - 1]:  # 避免重复解
                        k = k - 1
                    j = j + 1  # 双指针同时往中间移动，也是避免重复解
                    k = k - 1
                elif nums[i] + nums[j] + nums[k] > 0:  # 大了，大数左移
                    k = k - 1
                else:  # 小了，小数右移
                    j = j + 1
        return res

