class Solution:
    def XXX(self, n: int) -> str:
        def recur(pst: str) -> str:
            cnt= 1
            i = 1
            first = pst[0]
            past = first
            res = "" 
            while i < len(pst):
                if past == pst[i]:
                    cnt +=1
                else:
                    res += str(cnt) + past 
                    cnt = 1 
                past = pst[i] 
                i +=1
            res += str(cnt) + past 
            return res 
        fir = "1"
        res = fir
        for i in range(1,n):
            res = recur(res)
            # print(res)
        return res 

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


