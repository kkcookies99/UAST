class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        less=[i for i in nums if i<1]
        greater=[i for i in nums if i>1]
        equ=[i for i in nums if i==1]
            
        return(less+equ+greater)

