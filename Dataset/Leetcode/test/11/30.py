class Solution:
    def XXX(self, height: List[int]) -> int:
        res=0
        i=0
        j=len(height)-1
        while i<j:
            temp=(j-i)*min(height[i],height[j])
            if temp>res:
                res=temp
            if height[i]<height[j]:
                i+=1
            else:
                j-=1
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

