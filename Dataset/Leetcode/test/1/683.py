 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        for num1,i in enumerate(nums):
            for num2,z in enumerate(nums) :
                if i+z==target and (num1!=num2):
                    return num1,num2

