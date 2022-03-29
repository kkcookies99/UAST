class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res=[[]]
        for letter in nums:
            temp=[]
            for x in res:
                a=x+[letter]
                temp.append(a)
            res+=temp
        return res

