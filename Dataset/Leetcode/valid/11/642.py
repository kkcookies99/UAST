 class Solution:
    def XXX(self, height: List[int]) -> int:
        # 决定最大面积有两个因素：x， y
        # 最好的办法就是先选择其中一个，使其最大
        # 然后再挑选另一个
        # 所以双指针，从头尾开始向中间移动，无疑就是找到了最大的x
        # 然后向中间移动，来找到最合适的x和y，让面积最大
        # 而移动两个指针中小的那一个更是，在x减小的情况下
        # 去找更大的y，从而探索面积最大的可能性
        left = 0
        right = len(height)-1
        result = min(height[left], height[right])*(right-left)
        while left != right:
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
            tmp = min(height[left], height[right])*(right-left)
            result = max(result, tmp)
        return result

