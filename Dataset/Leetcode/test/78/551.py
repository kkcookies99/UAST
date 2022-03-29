 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res=[]
        res.append([])
        self.ziji(nums,res)
        return res    
    def ziji(self,nums,res,cur=[]):
        for i in range(len(nums)):
            res.append(cur+[nums[i]])
            self.ziji(nums[i+1:],res,cur+[nums[i]])

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


