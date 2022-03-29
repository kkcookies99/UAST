class Solution:
    def XXX(self, nums):
        length = len(nums)
        memory = []
        max_val = nums[0]
        sub_list = []
        for x1 in range(length):
            memory.append([])
            for x2 in range(length):
                memory[x1].append(nums[x2])
                if x2 > x1:
                    memory[x1][x2] = memory[x1][x2-1] + nums[x2]
                if memory[x1][x2] > max_val:
                    max_val = memory[x1][x2]
                    sub_list = nums[x1:x2+1]

        print(sub_list)
        return max_val

