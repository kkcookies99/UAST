class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def helper(nums, arr, res):
            if len(nums) < 1:
                res.append(arr)
                return 
            else:
                for i in range(len(nums)):
                    helper(nums[0:i]+nums[i+1:], arr +[nums[i]], res)


        res = []
        helper(nums, [], res)

        return res

