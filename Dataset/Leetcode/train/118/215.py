 class Solution(object):
    def XXX(self, numRows):
        paskTranList=[]
        form_list=numRows*[1]
        paskTranList=[[1],[1,1]]
        if numRows==1:
            return [[1]]
        if numRows==2:
            return paskTranList
        for i in range(0,numRows-2):
            new_list=[1]*(i+1)
            for j in range(0,i+1):
                new_list[j]=form_list[j]+form_list[j+1]
            form_list=[1]+new_list+[1]
            paskTranList.append(form_list)
        return paskTranList

