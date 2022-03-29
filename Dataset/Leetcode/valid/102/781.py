 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        ans=[]
        if root == None:
            return ans
        if root.left==root.right ==None:
            ans.append([root.val])
            return ans
        #  定义队列
        que=[]
        que.append(root)

        while len(que)!=0:
            num=len(que)
            temp = []
            while num>0:
                q=que.pop(0)
                temp.append(q.val)
                if q.left!=None:
                    que.append(q.left)
                if q.right:
                    que.append(q.right)

                num-=1
            ans.append(temp)

        return ans

