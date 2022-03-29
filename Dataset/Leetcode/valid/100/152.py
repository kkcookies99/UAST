 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        #成对节点
        que = collections.deque()
        que.append(p)
        que.append(q)
        while que:
            pp = que.popleft()
            qq = que.popleft()
            if pp==None :
                if qq==None:continue
                else:return False
            if qq==None:
                return False
            if pp.val!=qq.val:return False
            que.append(pp.left)
            que.append(qq.left)
            que.append(pp.right)
            que.append(qq.right)
        return True

