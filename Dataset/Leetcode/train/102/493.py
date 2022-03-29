class Solution(object):
    def XXX(self, root):

        if root==None:
            return []
        res=[]
        p=root
        queue=[p]
        while len(queue)!=0:
            count = len(queue)
            tmp=[]
            while count>0:
                cur = queue.pop(0)
                tmp.append(cur.val)
                if cur.left:
                    queue.append(cur.left)
                if cur.right:
                    queue.append(cur.right)
                count-=1
            res.append(tmp)

        return res

