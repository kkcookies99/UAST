class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        res = [] 
        def backtarck(cur,start):
            if len(cur) <= n:
                res.append(copy.deepcopy(cur))
            if len(cur) > n:
                return 
            for i in range(start,n):
                cur.append(nums[i])
                backtarck(cur,i+1)
                cur.pop(-1)
        backtarck([],0)
        return res 

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


