class Solution:
    def XXX(self, height: List[int]) -> int:
        # 双指针
        start, end = 0, len(height) - 1

        def cal_area(start, end):
            return min(height[start], height[end]) * (end - start)

        tmp_area = 0
        max_area = cal_area(start, end)

        while start != end:
            # 比较两条边的高度，移动较短的边
            if height[start] > height[end]:
                end -= 1
            else:
                start += 1
            
            # 移动完成之后，计算面积
            tmp_area = cal_area(start, end)

            if tmp_area > max_area:
                max_area = tmp_area

        return max_area




