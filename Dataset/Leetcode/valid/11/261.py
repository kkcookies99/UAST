class Solution:
    def XXX(self, height: List[int]) -> int:
        s = height
        l = len(height)
        i, j = 0, l-1
        max_water = 0
        while i < j:
            now_water = min(s[i],s[j])*(j-i)
            max_water = max(now_water,max_water)
            if s[i] > s[j]:
                j-=1
            else:
                i+=1
        return max_water

