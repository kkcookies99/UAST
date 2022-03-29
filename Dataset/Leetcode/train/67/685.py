class Solution:
    def XXX(self, a: str, b: str) -> str:
        a_list,b_list=[],[]
        res=[]
        a_length=len(a)
        b_length=len(b)
        if(a_length>b_length):
            for i in range(a_length-b_length):
                b_list.append(0)
        else:
            for i in range(b_length-a_length):
                a_list.append(0)
        for word in a:
            a_list.append(int(word))
        for word in b:
            b_list.append(int(word))
        additional=0
        j=len(a_list)-1
        while(j>=0):
            if(a_list[j]+b_list[j]==0):
                if(additional==0):
                    res.insert(0,0)
                    additional=0
                else:
                    res.insert(0,1)
                    additional=0
            elif(a_list[j]+b_list[j]==1):
                if(additional==0):
                    res.insert(0,1)
                    additional=0
                else:
                    res.insert(0,0)
                    additional=1
            elif(a_list[j]+b_list[j]==2):
                if(additional==0):
                    res.insert(0,0)
                    additional=1
                else:
                    res.insert(0,1)
                    additional=1
            else:
                print("error nums")
            j=j-1
        if(additional==1):
            res.insert(0,1)

        res=''.join([str(x) for x in res])
        return res

