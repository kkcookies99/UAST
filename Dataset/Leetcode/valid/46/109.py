class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums:
            return None
        if len(nums) == 1:
            return [nums]
        if len(nums) == 2:
            tmp = [[nums[0], nums[1]], [nums[1], nums[0]]]
            return tmp
        if len(nums) > 2:
            tmp = [[nums[0], nums[1]], [nums[1], nums[0]]]
            j = 2
            while j < len(nums):
                cur =[]
                for item in tmp:
                    k = len(tmp[0])
                    for i in range(k + 1):
                        a = item[:]
                        a.insert(i, nums[j])
                        cur.append(a)
                tmp = cur[:][:]

                j = j + 1
        return tmp


        

