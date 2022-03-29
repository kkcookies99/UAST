 class Solution:
    def XXX(self, n: int) -> str:
        n_str=''
        if n ==1:
            return '1'
        str_ = self.XXX(n-1)
        i =0
        while i <len(str_):
            k=0
            for j in range(i,len(str_)):
                if str_[i]==str_[j]:
                    k=k+1
                else:
                    break
            n_str = n_str+str(k)+str(str_[i])
            i =i+k
        return n_str                

