 class Solution:
    def XXX(self, strs: List[str]) -> str:
        length=len(strs)
        public_str=""
        lowerL=len(strs[0])

        for i in range(length):
            if len(strs[i])<lowerL:
                lowerL=len(strs[i])
        
        num=0
        matrix=[]
        
        for i in range(length):
            eachline=[]
            for j in range(lowerL):
                eachline.append(strs[i][j])
            matrix.append(eachline)

        for i in range(lowerL):
            li=list(list(zip(*matrix))[i])

            if Solution.is_same(li)==True and num==i:
                public_str+=strs[0][i]
                num+=1
            else:
                break
        
        return public_str
            
    def is_same(strs:list)->bool:
        index=0
        R=True
        for i in range(len(strs)):
            if i==len(strs)-1:
                break

            if strs[i]==strs[i+1]:
                continue
            else:
                R=False
                return R
        
        return R

