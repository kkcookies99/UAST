 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if not s:
            return ""
        if numRows == 1:return s
        split_s_len = numRows * 2 - 2
        data = []
        n = len(s)
        
        for i in range(0, n,split_s_len):
            data.append(s[i:i+split_s_len])
        #print(data)
        res = ""
        for i in range(numRows):
            for tmp in data:
                if i < len(tmp):
                    if i == 0 or i == numRows-1:
                        res += tmp[i]
                    else:
                        res += tmp[i]
                        if split_s_len -i  < len(tmp):
                            res += tmp[split_s_len-i]
        return res

