class Solution:
    def XXX(self, height: List[int]) -> int:
        area = 0
        left = 0
        max_h = max(height)
        right = len(height)-1

        while left<right:
            if(height[left]<=height[right]):
                area = max((right - left)*height[left],area)
                left +=1
            else:
                area = max((right - left)*height[right],area)
                right -= 1
            if(area>=max_h*(right - left)):
                break

        return area

