class Solution:
    def XXX(self, root: TreeNode) -> int:
        def helper(root,path:int,ans):
            if root:
                path+=1             #当前节点存在时，计数
            if not root:
                ans.append(path)    #当前节点不存在时，存储现有的计数，return ans
                return ans
            if not root.left and not root.right: 
                ans.append(path)    #当前节点就是叶子节点时，存储现有计数，return ans
                return ans 
            helper(root.left,path,ans)   #左右节点，开始深度优先搜索
            helper(root.right,path,ans)  
            return ans
        return max(helper(root,0,[]))   #返回最大深度

