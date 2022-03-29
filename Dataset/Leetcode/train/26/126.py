 class Solution:
    def XXX(self, nums: [int]) -> int:
        nums[:]= sorted(list(set(nums)))#一定还有排序
        #这个地方如果是nums= 就会错，因为只是单纯实现值传递，
        # 可以自行实验 查看id 进行地址比较 就明白了
        return len(nums)