class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        count = 0
        i = 0
        while count < n:
            if(nums[i] == 2): # 如果是2先往后插入，然后删除。index不走
                b = nums[i]
                del nums[i]
                nums.append(b)
                count += 1
            elif nums[i] == 0: #是0往前插入，然后删除，index走
                b = nums[i]
                del nums[i]
                nums.insert(0,b) 
                i+=1
                count += 1
            else: #1不动，只走index
                i+=1
                count += 1



