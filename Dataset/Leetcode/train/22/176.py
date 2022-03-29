 class Solution:
    def __init__(self):
        self. res = []
        
    def XXX(self, n: int) -> List[str]:
        left, right = n, n
        self.generater("", left, right)
        return self.res
        
    def generater(self, output, left, right):
        if left == 0 and right == 0:
            self.res.append(output)
        elif left <= right and left >= 0:
            self.generater(output+"(", left-1, right)
            self.generater(output+")", left, right-1)

