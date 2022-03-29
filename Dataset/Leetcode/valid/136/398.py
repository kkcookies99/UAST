 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        '''解法一'''
        # return 2 * sum(set(nums)) - sum(nums)
        '''解法二'''
        # return min(set(nums), key=nums.count)
        '''解法三'''
        return reduce(lambda x,y:x^y, nums)

