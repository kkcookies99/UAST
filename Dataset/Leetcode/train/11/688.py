 class Solution(object):
    def XXX(self, height):
        l,r,area=0,len(height)-1,0
        while l<r:
            if height[l]<height[r]:#左边高度更低，说明要让左边更高才有可能使得面积更大
                area=max((r-l)*height[l],area)
                l+=1
            else:#右边高度更低，说明要让右边更高才有可能使得面积更大
                area=max((r-l)*height[r],area)
                r-=1
        return area

