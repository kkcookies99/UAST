class Solution:
    def XXX(self, height: List[int]) -> int:
        high,width,max_v = 0,0,0
        for index_i,i in enumerate(height[:-1]):
            for index_j,j in enumerate(height[index_i+1:],start=index_i+1):
                if i <= j:
                    high = i
                else:
                    high = j
                width = index_j - index_i
                if high*width > max_v:
                    max_v = high*width
        return max_v

