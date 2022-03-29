 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        result = [""] * numRows
        sequence = (numRows*2-2)
        if numRows > 1:
            for i in range(len(s)//sequence):
            # i是段落数量

                for j in range(numRows):
                # j是数组序号
                    result[j] += s[i*sequence + j]
                    #print("position " + str(j) + " is " + s[i*sequence + j])

                for k in range(numRows, sequence):
                    result[sequence - k] += s[i*sequence + k]
                    #print("round " + str(k) + ", position " + str(sequence - k) + " is " + s[i*sequence + k])

            for l in range(len(s)%sequence):
                edge = len(s)//sequence
                if l < numRows:
                    
                    result[l] += s[(edge)*sequence + l]
                else:
                    result[sequence - l] += s[(edge)*sequence + l]

        else:
            result = s

        result_str = ""
        for sequence in result:
            result_str += sequence
        return result_str

