class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        num = 0
        for i in range(n//2+1):
            ones = n-2*i          
            num += math.factorial(ones+i)/(math.factorial(ones)*math.factorial(i))
        return num

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


