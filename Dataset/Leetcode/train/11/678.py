 class Solution:
    def XXX(self, height: List[int]) -> int:
        i, j, max_area= 0, len(height)-1, 0
        while i < j:
            if height[i] < height[j]: 
                max_area = max(max_area,(j-i) * height[i])
                i += 1
            else:
                max_area = max(max_area,(j-i) * height[j])
                j -= 1
        return max_area

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


