 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        #递归遍历
        # res=[]
        # def findPath(t,lst):
        #     if not t:
        #         return 
        #     findPath(t.left,lst)
        #     lst.append(t.val)
        #     findPath(t.right,lst)
        # findPath(root,res)
        # return res
        
        #迭代，把左子树压入栈，
        stack,res=[],[]
        while stack or root:#
            while root:
                stack.append(root)
                root=root.left
            root=stack.pop()
            res.append(root.val)
            root=root.right
        return res
            
        #还有第三种方法，morris遍历，用树的指针域来遍历，空间复杂度只有常熟级别，

