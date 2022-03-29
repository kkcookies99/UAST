 class Solution:
    def XXX(self, root):
        stack = []
        res = []

        if root == None:
            return res

        root.visited = False     # 代表是否已经加入过栈中
        stack.append(root)
        while len(stack) != 0:
            cur = stack.pop()

            if cur.visited:
                res.append(cur.val)

            else:
                if cur.right != None:
                    cur.right.visited = False
                    stack.append(cur.right)

                stack.append(cur)         # 将当前元素又放进去， 因为还没到遍历其val的时候

                if cur.left != None:
                    cur.left.visited = False
                    stack.append(cur.left)

                cur.visited = True

        return res

