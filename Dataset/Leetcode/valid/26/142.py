 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i =1
        j =len(nums)
        while i<j :
            if nums[i]==nums[i-1]:
                #因为不能使用额外的空间，所以想到的是直接操作列表，pop或remove,亲测使用pop的效率更高
                nums.pop(i)
                #nums.remove(nums[i])
                j -= 1
            else:
                i+=1

        return len(nums)

