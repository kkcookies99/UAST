 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows==1:
            return s
        elif numRows==2:
            return s[::2]+s[1::2]
        else:
            cycle_n = numRows+(numRows-2)
            cnt=1
            res = list([[] for _ in range(numRows)])
            res_word=''
            for word in s:
                if cnt<=numRows:
                    res[cnt-1].append(word)
                    cnt+=1
                elif cnt==cycle_n:
                    res[1].append(word)
                    cnt=1
                else:
                    index=(numRows-2)-(cycle_n-cnt)
                    res[-1-index].append(word)
                    cnt+=1
            for l in res:
                res_word+=''.join(l)
            return res_word

