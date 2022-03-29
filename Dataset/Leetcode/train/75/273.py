class Solution:
    def XXX(self, nums: List[int]) -> None:
        pre = [0,0,0] # 定义一个三元素的数组A
        for num in nums:
            pre[num] += 1 # 把原始数组的值当做A的下标，统计每个数字出现的次数
        i = 0  # 根据每个数字出现的次数，从0开始重置原始数组
        for n in range(len(pre)):
            for b in range(pre[n]):
                nums[i] = n
                i += 1 
        return nums 

