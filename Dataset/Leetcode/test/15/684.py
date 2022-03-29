 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ans = []
        nums = sorted(nums)

        for i in range(len(nums)):
            if i >=1 and nums[i] == nums[i-1]:
                continue

            current_nums = nums[:]
            current_num = current_nums.pop(i)
            current_ans = self.XXX(current_nums, 0-current_num)

            for c in current_ans:
                c.append(current_num)
                c = sorted(c)
                if c not in ans:
                    ans.append(c)
        
        return ans
    
    # return all the value pair that can add up to
    # the target
    def XXX(self, nums, target):
        ans = []
        hash_dict = {}

        for i in range(len(nums)):
            if nums[i] in hash_dict:
                ans.append([nums[i], hash_dict[nums[i]]])
            else:
                hash_dict[target-nums[i]] = nums[i]
        
        return ans
        

