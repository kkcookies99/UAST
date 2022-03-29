class Solution:
    # def XXX(self, x: int) -> int:
    def XXX(self, x):
        # x = [int(i) for i in str(x)]
        if x >= 0:
            x_list = list(map(int, str(x)))
            x_num = self.list_XXX(x_list)
        else:
            x_list = list(map(int, str(abs(x))))
            x_num = -self.list_XXX(x_list)
        return x_num
            
    def list_XXX(self, x_list):
        """ list XXX """
        x_list.XXX()
        x_int = int("".join([str(x) for x in x_list]))
        if -2**31 <= x_int and x_int <= 2**31 - 1:
            return x_int
        else:
            return 0

