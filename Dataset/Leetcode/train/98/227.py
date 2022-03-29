 class Solution(object):
    def XXX(self, root):
        res, stack, node = [],[],root
        while stack or node:
            while node:
                stack.append(node)
                node = node.left
            node = stack.pop()
            res.append(node.val)
            node = node.right
        length = len(res)
        return [res[i]<res[i+1] for i in range(length-1)]==[True]*(length-1)