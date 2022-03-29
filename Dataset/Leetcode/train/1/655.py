 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
       l = []
       for num in nums:
           d = target - num
           if d in nums.remove(num):
               l.append(nums.index(num))
               l.append(nums.index(d))
               return l

