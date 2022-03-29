class Solution:
    def XXX(self, x: int) -> int:
        if x > 0:
            temp = str(x)
            temp_XXX = temp[::-1]
            if int(temp_XXX) > 2147483647 :
                return 0
            return int(temp_XXX)
        else:
            temp = str(abs(x))
            temp_XXX = temp[::-1]
            if int(temp_XXX) > 2147483648 :
                return 0
            return 0-int(temp_XXX)

