 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = []
        line = []
        for i in range(numRows):
            for j in range(i-1):
                line[j]+=line[j+1]
            line=[1]+line#把[1]接在line前面
            print(line)
            ans.append(line)#将处理过的line加入ans最后，但输出的ans表明放进去的line是没接[1]之前的line。不懂。。。。
        return ans

