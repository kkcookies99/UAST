 class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        result=[]
        max_len=max(len(a),len(b))+1
        a,b=(max_len-len(a))*'0'+a,(max_len-len(b))*'0'+b
        flag=0
        for i in range(max_len-1,-1,-1):
            temp=flag+int(a[i])+int(b[i])
            if temp>1:
                temp-=2
                flag=1
            else:
                flag=0
            result.append(str(temp))
        if result[-1]=='0':
            result.pop()
        return ''.join(result[::-1])

