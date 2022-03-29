class Solution:
    def XXX(self, x):
        '''
        :type x: int
        :rtype: int
        '''
        num_sqrt = x ** 0.5
        x_str = str(num_sqrt)
        result = x_str.split('.', 1)
        return int(result[0])
        

