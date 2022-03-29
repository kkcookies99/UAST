 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        """
        实现需求:给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
        :param nums: 待进行查找的数组
        :param target: 目标值
        :return: 符合题目要求的列表形式返回
        """
        for temp_num in nums:
            # 如果目标结果与该值的差值在可运算集合中,并且差值不能与其被减数相同,则判定为该值可找到
            d_value = target - temp_num
            
            if d_value in nums:
                if temp_num is not d_value:
                    break
                elif temp_num is d_value and nums.count(temp_num) > 1:
                    break
        
        x_index = nums.index(temp_num)
        nums.remove(temp_num)
        y_index = nums.index(d_value) + 1
        
        return [x_index, y_index]

