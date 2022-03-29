 class Solution:
    # def _XXX(self, s: str, numRows: int) -> str:
    #     if numRows <= 1:
    #         return s
    #     length = len(s)
    #     li = []
    #     column = (length//(numRows*2-2)+1)*(numRows-1)
    #     for i in range(numRows):
    #         for j in range(column):
    #             if j % (numRows-1)==0:
    #                 if (numRows*2-2)*(j//(numRows-1))+i < length:
    #                     li.append(s[(numRows*2-2)*(j//(numRows-1))+i])
    #             elif(j+i)%(numRows-1)==0 and (numRows*2-2)*(j//(numRows-1))+numRows+j%(numRows-1)-1 < length:
    #                 li.append(s[(numRows*2-2)*(j//(numRows-1))+numRows+j%(numRows-1)-1])

    #     return ''.join(li)
    def XXX(self, s: str, numRows: int) -> str:
        if numRows <= 1:
            return s
        length = len(s)
        column = (length//(numRows*2-2)+1)*(numRows-1)
        # li = [['' for a in range(column)] for b in range(numRows)]
        # cursor = 0
        # for j in range(column):
        #     for i in range(numRows):
        #         if j % (numRows-1)==0 or (j+i)%(numRows-1)==0:
        #             li[i][j] = s[cursor]
        #             cursor += 1
        #             if cursor == length:
        #                 break
        #     if cursor == length:
        #         break
        # print(li)
        # 周期数 i//(2*(numRows-1))
        li = ['' for a in range(numRows)]
        cycle = (2*(numRows-1)) # 周期
        for i in range(length):
            if i%cycle < numRows: 
                # 完整列
                # li[i%cycle][i//cycle*(numRows-1)] = s[i]
                li[i%cycle] += s[i]
            else:
                # 其他列
                li[numRows-(i%cycle)%numRows-2] += s[i]
                # try:
                #     li[numRows-(i%cycle)%numRows-2][i//cycle*(numRows-1) + (i%cycle)%numRows + 1] = s[i]
                # except (IndexError):
                #     print("IndexError")
        # s2 = ''
        # for k in li:
        #     s2 += ''.join(k)
        #     # for l in k:
        #     #     s2 += l
        # return s2
        return ''.join(li)

