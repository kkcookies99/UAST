 class Solution:
    def XXX(self, root: TreeNode) -> bool:
         if not root:
            return True
        queue = [root]
        while(queue):
            res = []
            for _ in range(len(queue)):
                curr = queue.pop()#出队
                if not curr.left:
                    res.append(None)
                else:
                    queue.insert(0,curr.left)
                    res.append(curr.left.val)
                if not curr.right:
                    res.append(None)
                else:
                    queue.insert(0,curr.right)
                    res.append(curr.right.val)
            #每一层检查res是否对称
            for i in range(len(res)//2):
                if res[i]!=res[-1-i]:
                    return False
        return True

