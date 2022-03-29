class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def even_ex(nums,size):#定义两个函数，第一个函数是偶数对遍历，从下标0开始
            if size <2:
                return nums
            first = 0
            second = 1
            while second < size:
                if nums[first]>nums[second]:
                    nums[first], nums[second] = nums[second], nums[first]

                first += 2
                second +=2
            return nums
        def odd_ex(nums,size): # 第二个为奇数对遍历，从下标1开始
            if size <= 2:
                return nums
            first = 1
            second = 2 
            while second < size:
                if nums[first] > nums[second]:
                    nums[first], nums[second] = nums[second], nums[first]
                first += 2
                second += 2 
            return nums
        size = len(nums)
        count = 0
        while True: #循环遍历
            nums = odd_ex(even_ex(nums, size),size)
            count += 1 
            nums_c = nums.copy() #注意⚠️这里判断时需要copy数组，而不是直接等于，直接等于还是指向原内存地址，再次调用函数肯定是相等的
            if nums_c == odd_ex(even_ex(nums, size),size): #如果相等说明已经排好序，退出返回nums
                break
        
        return nums 

