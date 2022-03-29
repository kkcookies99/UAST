 class Solution:
    def XXX(self, nums: List[int]) -> int:
        '''
        从第二个向后查找与前面相比，没找到不重复的值就替换掉前面重复的值
        '''
        i = 0
        j = 1
        while j < len(nums):
            if (nums[i] != nums[j]):
                nums[i+1] = nums[j]
                i += 1
            j += 1                  #查找向后移动
        i += 1                      #删除掉i之后位置所有重复的值
        while (i < len(nums)):
            del nums[i]
        print(len(nums),nums)

