 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        def two_sum(num, target):
            dic = {}
            ans = []
            record = {}
            for ind, val in enumerate(num):
                if target - val in dic and val not in record:
                    record[val] = 1
                    ans.append([-target, val, target - val])
                dic[val] = 1
            return ans
        ans = []
        record = {}
        for i in range(len(nums) - 2):
            temp = two_sum(nums[i + 1:], -nums[i])
            for each in temp:
                t = tuple(each)
                if t not in record:
                    ans.append(each)
                    record[t] = 1
        return ans


