 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        #貌似可以用一个递归
        if n==1:
            return "1"
        str_ = self.XXX(n-1)
        # print(str_)
        #des
        res = ""
        pre=str_[0]
        tmp_cnt = 1
        idx = 1
        while idx<len(str_):
            if(str_[idx] == pre):
                idx +=1
                tmp_cnt+=1
            else:
                #append
                res+=str(tmp_cnt)+str(pre)
                #reset
                pre=str_[idx]
                tmp_cnt = 1
                idx+=1
        res+=str(tmp_cnt)+str(pre)

        return res


