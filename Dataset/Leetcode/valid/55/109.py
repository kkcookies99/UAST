class Solution:
    def XXX(self, nums):
        
        far = 0
        for k, v in enumerate(nums):
            far = max(far, k+v)
            if far <= k and k != len(nums)-1:
                return False

        return True

