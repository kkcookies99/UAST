 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        L=[]
        for i in range(numRows):
        	for j in range(i+1):
		        if j==0:
			        L.append([1])
		        elif j==i:
			        L[i].append(1)
		        else:
			        L[i].append(L[i-1][j-1]+L[i-1][j])
        return L

