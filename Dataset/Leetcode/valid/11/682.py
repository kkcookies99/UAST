 class Solution:
    def XXX(self, height: List[int]) -> int:
        most,hlen = 0,len(height)
        start,end=0,hlen-1
        while start<end:
            a,b=height[start],height[end] 
            if a<b:
                ret = (end-start)*a
                while height[start] <= a:
                    start+=1
            else:
                ret = (end-start)*b
                end-=1
                while height[end] < b:
                    end-=1
                if a==b:
                    start+=1
                    while height[start] < a:
                        start+=1
            most = max(ret,most)
        return most

