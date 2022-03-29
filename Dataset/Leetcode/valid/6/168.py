 class Solution(object):                                                            
    def XXX(self, s, numRows):                                                 
        """                                                                        
        :type s: str                                                               
        :type numRows: int                                                         
        :rtype: str                                                                
        """                                                                        
        if numRows == 1: return s                                                  
        result = [['' for i in range(len(s))] for j in range(numRows)]             
        i, j = 0, 0                                                                
        direction = 'down'                                                         
        for char in s:                                                             
            result[i][j] = char                                                    
            if direction == 'down':                                                
                if i == numRows - 1:                                               
                    direction = 'up'                                               
                    i -= 1                                                         
                    j += 1                                                         
                else:                                                              
                    i += 1                                                         
            else:                                                                  
                if i == 0:                                                         
                    direction = 'down'                                             
                    i += 1                                                         
                else:                                                              
                    i -= 1                                                         
                    j += 1                                                         
        ret = ''                                                                   
        for r in result:                                                           
            ret += ''.join(r)                                                      
        return ret

