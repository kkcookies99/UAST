 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        length=len(nums)
        res=[]
        for i in range(2**length):
            temp=[]
            code=self.parse(i,length)
            for j in range(length):
                """
                按二进制结果取元素
                """
                if code[j]==1:
                    temp.append(nums[j])
            res.append(temp)
        return res
    
    
    def parse(self,num,count):
        """
        十进制和二进制转化
        """
        res=[]
        while(len(res)!=count):
            if num!=0:
                res.append(num%2)
                num=num//2
            else:
                res.append(0)
        return res

