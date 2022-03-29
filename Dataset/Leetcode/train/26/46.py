 def XXX(self, nums: List[int]) -> int:
        flag = 0                  # 定义一个指针变量
        for num in nums:          # 遍历数组
            if nums[flag] != num: # 若指针指向的元素与当前遍历数组的元素不同
                flag += 1         # 指针后移一位
                nums[flag] = num  # 修改数组，将不同的元素占用重复元素的位置
            # 若相同则指针不动，数组继续往后遍历
        # 注意考虑数组为空的情况（flag初始值为0，由于要求数组长度，故需要加1）
        return len(nums) and flag + 1 

