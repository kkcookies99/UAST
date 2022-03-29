class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        count_num = 0
        num = ''
        strs = ''
        for char in self.XXX(n-1):
            if char != num:
                if count_num > 0:
                    strs += str(count_num) + num
                count_num = 1
                num = char
            else:
                count_num += 1
        strs += str(count_num) + char
        return strs
                

