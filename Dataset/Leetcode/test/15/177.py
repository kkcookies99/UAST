 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums = sorted(nums)
        length = len(nums)
        res = []

        for i in range(length):
            p1 = 0
            p2 = length - 1
            while p1 < i < p2:
                num = nums[i] + nums[p1] + nums[p2]
                if (nums[p1] > 0) or (nums[p2] < 0):
                    break
                if num > 0: 
                    p2 -= 1
                elif  num < 0:
                    p1 += 1
                else:
                    if [nums[p1],nums[i],nums[p2]] not in res:
                        res.append([nums[p1],nums[i],nums[p2]])
                    else:
                        pass
                    p1 += 1
                    p2 -= 1

        return sorted(res)```

