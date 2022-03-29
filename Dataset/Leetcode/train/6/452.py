 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s

        store_list = [[] for i in range(0, numRows)]
        list_num = ([i for i in range(numRows)] + [i for i in range(numRows-2, 0, -1)]) * math.ceil(len(s)/(2*numRows - 2)) 
        
        for i in range(len(s)):
            store_list[list_num[i]].append(s[i])
        
        return ''.join([''.join(x) for x in store_list])

