class Solution:
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        save_list = [0,1,2,3]
        
        for i in range(4,n + 1):
            
            save_list.append(save_list[i-2] + save_list[i-1])
        
        return save_list[n]

