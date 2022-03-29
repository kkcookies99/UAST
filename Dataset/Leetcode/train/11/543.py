 class Solution:
    def XXX(self, height: List[int]) -> int:
        height = list(enumerate(height))
        height.sort(key=lambda x:x[1],reverse=True)
        l_max = r_max = height[0][0]
        ans = 0
        for i,h in height[1:]:
            ans = max(ans,h*abs(l_max-i),h*abs(r_max-i))
            l_max = min(l_max,i)
            r_max = max(r_max,i)
        return ans

