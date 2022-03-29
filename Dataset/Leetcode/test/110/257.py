class Solution(object):
    def XXX(self, root):
      

        def maxDepth(self, root):
            if not root:
                return 0
            else:
                q=[(1,root)]
                max_depth=0
                while q:
                    depth,cur_node=q.pop(0)
                    if cur_node is not None:
                        max_depth=max(depth,max_depth)
                        q.append((depth+1,cur_node.left))
                        q.append((depth+1,cur_node.right))
                return max_depth
                

        a=root.left
        b=root.right
        num1=maxDepth(a)
        num2=maxDepth(b)
        if root is None:
            return True
        if num1==num2:
            return True
        if num1!=num2:
            return False

