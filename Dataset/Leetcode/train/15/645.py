 class Solution:
    def XXX(self, nums):
        self.nums = nums
        ans1 = []
        ans2 = []
        for i in range(len(self.nums)):
            for j in range(i+1,len(self.nums)):
                for k in range(j+1,len(self.nums)):
                    if self.nums[i]+self.nums[j]+self.nums[k] == 0:
                        ans1.append(self.nums[i])
                        ans1.append(self.nums[j])
                        ans1.append(self.nums[k])
                        if sorted(ans1) not in ans2:
                            ans2.append(sorted(ans1))
                        ans1.clear()
        return sorted(ans2)

