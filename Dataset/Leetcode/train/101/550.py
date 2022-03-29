 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def ishuiwen(p):
            index1 = 0
            index2 = len(p) - 1
            while index1 < len(p) and index2 >= 0 and p[index1] == p[index2]:
                index1 += 1
                index2 -= 1
            if index2 > index1:
                return False
            else:
                return True
        if not root:
            return True
        from collections import deque
        d = deque([root])
        ret = []
        while d:
            tmp = []
            for _ in range(len(d)):
                a = d.popleft()
                if not a:
                    tmp.append(None)
                    continue
                else:
                    tmp.append(a.val)
                if a.left:
                    d.append(a.left)
                else:
                    d.append(None)
                if a.right:
                    d.append(a.right)
                else:
                    d.append(None)
            ret.append(tmp)
        return all([ishuiwen(i) for i in ret])

