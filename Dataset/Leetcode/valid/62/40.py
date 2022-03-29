 class Solution:
    def XXX(self, m: int, n: int) -> int:
        def move(x,y):
            if x==m-1 and y==n-1:
                path.append([x,y])
                res.append(path[:])
                return

            path.append([x,y])
            for d in [[0,1],[1,0]]:#向右/下,原点在左上方
                newx=x+d[0]
                newy=y+d[1]
                if 0<=newx<m and 0<=newy<n:
                    move(newx,newy)
            path.pop()

        
        path=[]
        res=[]
        move(0,0)
        return len(res)

