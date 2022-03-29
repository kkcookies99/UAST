 class Solution:
    def XXX(self, height: List[int]) -> int:
        start = 0
        end = len(height) - 1
        max_area = 0
        while start < end:
            temp_area = (height[start] if height[start] < height[end] else height[end]) * (end - start)
            max_area = max_area if max_area > temp_area else temp_area
            if height[start] < height[end]:
                start += 1
            else:
                end -= 1
        return max_area

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


