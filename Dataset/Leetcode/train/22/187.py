 class Solution:
    def parenthesis(self,sub_ans,leftnum,rightnum,ans):
        if leftnum == 0 and rightnum==0: #结束口
            return ans.append(sub_ans)

        if  rightnum>leftnum:
            self.parenthesis(sub_ans+')',leftnum,rightnum-1,ans)

        if leftnum>0:
            self.parenthesis(sub_ans+'(',leftnum-1,rightnum,ans)
        return ans
    
    def XXX(self, n: int) -> List[str]:
        leftnum = n
        rightnum = n
        return self.parenthesis("",leftnum,rightnum,[])

