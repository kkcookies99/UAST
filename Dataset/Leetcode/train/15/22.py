 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        size = len(nums)
        if size < 3:
            return []
        nums.sort()
        res = []
        for i in range(size):
            # 遍历到第一个正数时，之后的都是正数了，三数和不可能为0了，结束遍历
            if nums[i] > 0:
                return res
            # 这里的目的是对第一个元素去重，而另外两个元素去重在寻找另外俩元素时完成的，合在一起刚好可对三元素去重。
            # 比如遍历到一个元素num[i]=-2，之后的左右指针遍历会找出所有与-2相加等于0的组合，
            # 所以第一个元素还出现-2时肯定重复了，无需再遍历
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            l = i + 1
            r = size - 1
            # 这里能找出与第一个元素和为0的所有组合
            while r > l:
                # 因为Nums是有序的，和大于0说明右边的正数太大了，让r-1，和小于0说明中间的负数太小了，得l+1。
                if nums[r] + nums[l] + nums[i] > 0:
                    r -= 1
                elif nums[r] + nums[l] + nums[i] < 0:
                    l += 1
                else:
                    res.append([nums[i], nums[l], nums[r]])
                    l += 1
                    # 第二个元素去重，比如-3+1+2，l之后再出现1，r对应的组合只能是2，所以必然重复了
                    while l < r and nums[l] == nums[l - 1]:
                        l += 1
                    r -= 1
                    # 同理对第三个去重，直到找到下一个不同的元素。
                    while l < r and nums[r] == nums[r + 1]:
                        r -= 1
        return res

