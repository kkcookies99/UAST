class Solution:
    def XXX(self, x: int) -> int:
        if x == 0:
            return 0
        else:
            leftmark = 1
            rightmark = x
            while  rightmark - leftmark > 1:
                middle = (leftmark + rightmark) // 2
                if middle ** 2 == x:
                    return middle
                elif middle ** 2 > x:
                    rightmark = middle
                else:
                    leftmark = middle
            return leftmark 

