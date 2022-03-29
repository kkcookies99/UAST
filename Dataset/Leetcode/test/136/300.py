 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        temp={}
        for i in nums:
            if i not in temp.keys():
                temp[i]=1
            else:
                temp[i]+=1
        for key,val in temp.items():
            if val==1:
                return key
        return 1```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


