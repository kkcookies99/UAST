 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        arr=[[] for _ in range(numRows)]
        index=0
        add_reduce_flag=1
        for i in range(len(s)):
            arr[index].append(s[i])
            if add_reduce_flag==1:
                index+=1
            elif add_reduce_flag==-1:
                index-=1
            if numRows==1:
                index=0
            elif index==numRows:
                index-=2
                add_reduce_flag=-1
            elif index==-1:
                index+=2
                add_reduce_flag=1
        arr=[''.join(x) for x in arr]
        arr=''.join(arr)
        return arr

