 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if(len(strs)==1):
            return strs[0]
        else:
            min_len = len(strs[0])
            index = 0
            min_index = 0
            for i in range(len(strs)):
                if(len(strs[i])<min_len):
                    min_len = len(strs[i])

            for i in range(len(strs)-1):
                for j in range(min_len):
                    comp1=strs[i][j]
                    comp2=strs[i+1][j]
                    if(comp1==comp2):
                        index = index+1
                        if(i==0):
                            min_index = index
                        if(j==min_len-1):
                            index = 0
                    else:
                        if(index<min_index):
                            min_index = index
                        index = 0
                        break
            return strs[0][:min_index]


