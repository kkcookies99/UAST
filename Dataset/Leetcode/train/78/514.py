 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        
        res = [nums]
        
        def backtrack(clist, nlist, k):
            if k == 0:
                res.append(clist)
                return
            
            for cur in range(0, len(nlist)-k+1):
                newlist = nlist[cur+1:]
                backtrack(clist+[nlist[cur]], newlist, k-1)
        
        for k in range(len(nums)):
            backtrack([], nums, k)
            
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


