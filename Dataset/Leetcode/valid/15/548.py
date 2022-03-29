 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        """头尾指针，像中间靠拢，判断第三个元素是否存在在中间数组里"""
        res = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                n = len(nums[i:j+1])
                if n < 3:
                    continue
                left, right = 0, n-1
                while left+1 < right:
                    third = 0 - (nums[left]+nums[right])
                    if third in nums[left+1:right]:
                        x = [nums[left], third, nums[right]]
                        x.sort() 
                        if not x in res:
                            res.append(x)
                    right -= 1
                left, right = 0, n-1
                while left+1 < right:
                    third = 0 - (nums[left]+nums[right])
                    if third in nums[left+1:right]:
                        x = [nums[left], third, nums[right]]
                        x.sort()
                        if not x in res:
                            res.append(x)
                    left += 1
        return res

