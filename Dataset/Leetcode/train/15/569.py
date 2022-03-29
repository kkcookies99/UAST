 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        # 不够3个数，则不存在abc
        if len(nums) < 3:
            return []
        
        # 先小到大排序
        arr = sorted(nums)
        if arr[0] > 0 or arr[-1] < 0:  # 最小的大于0或最大的小于0，则不存这样的三个数
            return []

        # 一层for循环i从前到后，下一层双指针从两端到中间, O(n^2)
        res = []
        used = []
        for i in range(len(arr)):
            a = arr[i]
            if a <= 0 and a not in used:  # a大于0时，后面的都是正数，不存在abc了, 跳出for i 循环
                # 初始化两端指针
                left = i + 1  # i 后面序列的最左端
                right = len(arr) - 1  # i后面序列的最右端
                while left < right:  # left == right时，两个指针指向同一个数
                    b = arr[left]
                    c = arr[right]
                    if (a + b + c) == 0:
                        if [a, b, c] not in res:  # 找到一组解，且没保存过
                            res.append([a, b, c])
                            used.append(a)
                        left = left + 1
                        right = right - 1
                    elif (a + b + c) > 0:  # 此时若移动left，则结果会更大，应该移动right
                        right = right - 1
                    elif (a + b + c) < 0:  # 此时若移动right，则结果会更小，应该移动left
                        left = left + 1
            
        
        return res

