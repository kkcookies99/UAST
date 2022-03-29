 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        line,all_line = [1],[]
        for i in range(1,numRows+1):
            all_line.append(line[:])
            line = [0]+line
            for j in range(i):
                line[j] = line[j] + line[j+1]
        return all_line

