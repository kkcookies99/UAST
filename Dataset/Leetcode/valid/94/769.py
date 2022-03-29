 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        #0.创造辅助栈，未使用标注为0，使用标注为1
        stack = [(0,root)]
        result = []
        #1.迭代
        while stack:
            tf, node = stack.pop()            
            if tf == 1:
                result.append(node.val)            
            elif node:
                stack.append((0,node.right))
                stack.append((1,node))                
                stack.append((0,node.left))
        return result

