class Solution:
    '''
    三路快排
    '''
    def quickSort3Way(self,nums,l,r):
        if l >= r:
            return
        lt = l      # [l+1,lt]<v
        gt = r+1   # [gt,r]>v
        i = l + 1
        v = nums[l]
        while i < gt:
            if nums[i] < v:
                nums[i], nums[lt + 1] = nums[lt + 1], nums[i]
                lt += 1
                i += 1
            elif nums[i] > v:
                nums[i], nums[gt - 1] = nums[gt - 1], nums[i]
                gt -= 1
            else:
                i += 1
        nums[l],nums[lt] = nums[lt],nums[l]
        self.quickSort3Way(nums,l,lt-1)
        self.quickSort3Way(nums,gt,r)
        # print(l,lt,gt,r)

    def XXX(self, nums):
        """
        仅使用常数空间的一趟扫描算法
        思路：使用三路快排
        :param nums:
        :return:
        """
        l = 0
        r = len(nums)
        self.quickSort3Way(nums,l,r-1)
        print(nums)
        

