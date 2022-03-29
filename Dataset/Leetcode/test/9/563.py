 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: bool
        """
        s=str(x)
        n=len(s)
        i,j=0,n-1
        while i<=j:
            if s[i]!=s[j]:
                return False
            else:
                i=i+1
                j=j-1
        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


