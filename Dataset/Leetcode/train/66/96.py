 class Solution:
    def XXX(self, digits):
        '''
        :type digits: List[int]
        :rtype :List[int] 
        '''
        d = int(''.join([str(i) for i in digits]))+1
        return [int(i) for i in str(d) ]


