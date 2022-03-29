class Solution:
    def XXX(self, nums):
        if len(nums) == 0 or len(nums) == 1:
            return True

        self.visit = set()
        return self.func(nums, 0)
        

    def func(self, nums, idx):
        
        self.visit.add(idx)

        if idx >= len(nums) - 1:
            return True

        for j in range(idx + 1, idx + nums[idx] + 1):
            if j not in self.visit and self.func(nums, j):    
                return True

        return False

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


