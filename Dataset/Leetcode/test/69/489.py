class Solution:
    def XXX(self, x: int) -> int:
        # 方法一
        return floor(sqrt(x))

        # 方法二：
        # if x <=1:
        #     return x
        # sqrt_x = x 
        # while x/sqrt_x < sqrt_x:
        #     # 表示两数相除,向下取整
        #     sqrt_x = (sqrt_x + x/sqrt_x)//2 
        # return int(sqrt_x)

        # 方法三
        # # 对给定的x作二分查找，如果它的半数的平方大于x，则继续折半
        # new_x = x//2
        # while new_x**2 > x:
        #     new_x = new_x//2
        # # 如果折半后的平方小于x 且加1后的平方还是小于等于x，则新的x递增一
        # while new_x**2 < x and (new_x+1)**2 <= x:
        #     new_x += 1
        # # 如果new_x的平方刚好等于x  或者 new_x的平方小于x 但同时new_x加一后的平方大于x,则直接返回new_x
        # if new_x**2 == x or (new_x**2 < x and (new_x+1)**2 > x):
        #     return new_x

