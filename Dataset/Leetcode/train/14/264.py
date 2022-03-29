 class Solution:
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        prefix=''     
        len_strs = len(strs)
        if len_strs>0:
            freq = []
            # length = len(strs)
            # len_min = min([len(str) for str in strs])
            length = [len(str) for str in strs]
            len_min = min(length)
            min_id = length.index(len_min)
            min_len_str = strs[min_id]

            for i in range(len_min):        
                char = min_len_str[i]
                freq = sum([str[i]==char for str in strs])
                if freq==len_strs:
                    prefix += char
                else:
                    break
        
        return prefix      
'''
