class Solution:
    def XXX(self, x: int) -> int:
        left=1
        right=x
        mid=(left+right)//2
        while left<=right:
            square=mid*mid
            if square==x:
                return mid
            elif square>x:
                right=mid-1
            else:
                left=mid+1
            mid=(left+right)//2
        return right

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


