class Solution:
    def XXX(self, nums: List[int]) -> bool:
        # method 1
        max_step = 0
        for num in nums[:-1]:
            max_step = max(max_step - 1, num)
            if num == 0 and max_step == 0:
                return False
        return True   

        # method 2
        for x in range(len(nums)-1):
            num = nums[x]
            if num == 0:
                ret = False
                for y in range(x-1, -1, -1):
                    if nums[y] > x - y:
                        ret = True
                        break
                if not ret:
                    return ret
        return True
        

