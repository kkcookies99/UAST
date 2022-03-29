 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        res = []
        # 枚举中间的数
        for i in range(1, n - 1):  # O(N^2)
            j, k = 0, n - 1
            while j < i < k:
                if nums[i] + nums[j] + nums[k] > 0:  # 如果大于0，大数调小
                    k -= 1
                else:
                    if nums[i] + nums[j] + nums[k] == 0 and [nums[i], nums[j], nums[k]] not in res:
                        res.append([nums[i], nums[j], nums[k]])
                    j += 1
        return res

