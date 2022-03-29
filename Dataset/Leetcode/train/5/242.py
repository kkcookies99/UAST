 class Solution:
    def XXX(self, s: str) -> str:
        """
        首先要想到的是从中心往外面扩展的办法,但这样只能找到奇数长度的回文
        """
        s1=s
        s=list(s)
        Len=len(s)
        if Len==0:
            return ''
        if Len==1:
            return s1
        if Len==2:
            if s[0]==s[1]:
                return s1
            else:
                return s[0]
            
        even=[]
        odd=[]
       
        for i in range(1,Len):
            j=1
            while i-j>-1 and i+j<Len:
                if s[i+j]!=s[i-j]:
                    odd.append(2*j-1)
                    break
                else:
                    if (i+j==Len-1) | (i-j==0):
                        odd.append(2*j+1)
                        break
                    else:
                        j=j+1
        
        for i in range(Len):
            i=i+0.5
            j=0.5
            while i-j>-1 and i+j<Len:
                if s[int(i+j)]!=s[int(i-j)]:
                    even.append(2*(j-0.5))
                    break
                else:
                    if (int(i+j)==Len-1) | (int(i-j)==0):
                        even.append(2*j+1)
                        break
                    else:
                        j=j+1
                
        
        e=max(even)
        o=max(odd)
        if e<o:
            index=odd.index(o)
           
            return ''.join([i for i in s[index+1-int((o-1)/2):index+2+int((o-1)/2)]])
        else:
            index=even.index(e)
            return ''.join([i for i in s[index-int((e/2-1)):index+int(e/2)+1]])

