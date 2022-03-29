 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        finalRes=''
        if numRows==1:
            return s
        else:
            newMatr=[]
            moji=[]
            blockSize=2*numRows-2
            numberLine=len(s)//(blockSize)
            addZeros=(blockSize)-(len(s)%(blockSize))
            s+=addZeros*'@'
            for i in range(numberLine+1):
                newMatr.append(s[i*blockSize:i*blockSize+numRows])
                moji='@'+s[i*blockSize+numRows:(i+1)*blockSize]+'@'
                moji=moji[::-1]
                newMatr.append(moji)
            for i in range(numRows):
                for ele in newMatr:
                    if ele[i]!='@':
                        finalRes+=ele[i]
            return finalRes
