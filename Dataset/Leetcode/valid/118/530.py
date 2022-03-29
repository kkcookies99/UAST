 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res = []
        for i in range(numRows):
            rowi = [0]*(i+1)
            for j in range(int(i/2)+1):
                if(j == 0):
                    rowi[j] = 1
                    rowi[i-j] = 1
                elif(i > 1):
                    rowi[j] = res[i-1][j-1]+res[i-1][j]
                    rowi[i-j] = rowi[j]
            res.append(rowi)
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


