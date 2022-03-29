class Solution:
    def XXX(self, height: List[int]) -> int:
        max_area = 0
        n = len(height)

        for i in range(n):
            for j in range(i + 1, n):
                rea_height = min(height[i], height[j])

                curr_area = rea_height * (j - i)

                max_area = max(max_area, curr_area)

        return max_area

