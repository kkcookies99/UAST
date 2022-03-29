class Solution:
    def XXX(self, height: List[int]) -> int:
        si = 0
        ei = len(height) -1
        result = 0  
        while si < ei:
            w =  ei - si 
            if height[si] < height[ei]:
                h = height[si]
                si += 1
                if  w * h > result:
                    result = w * h
            else:
                h = height[ei]
                ei -= 1
                if w * h > result:
                    result = w * h 
        return result 

