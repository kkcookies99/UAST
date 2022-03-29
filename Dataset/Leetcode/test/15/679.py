 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        dic, n, ans = {}, len(nums), []
        for i in range(n):
            dic = {}
            for j in range(i + 1, n):
                key = nums[j]
                if key in dic:
                    value = dic[key] + [key]
                    value.sort()
                    if value not in ans:
                        ans.append(value)
                key = -nums[i] - nums[j]
                if key not in dic:
                    dic[key] = [nums[i], nums[j]]
        return ans

