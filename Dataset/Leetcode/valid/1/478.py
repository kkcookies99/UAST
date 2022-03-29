 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        index = []
        for i in range(len(nums)):# i=0,1,2,3
            for j in range(i+1,len(nums),1):
                sum = nums[i]+nums[j]
                if sum == target:
                    index.append(i)
                    index.append(j)
                    break
            if len(index)!=0:
                break
        return index

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


