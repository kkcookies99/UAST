 class Solution:
    # 解题思路：
    # 从根节点向叶子节点遍历，
    # 判断：当前节点是否为空，如果不为空则对当前节点左右子节点进行递归调用,targetSum-=root.value
    # 终止条件：当节点为空，返回False
    # 当节点不为空，且targetSum-root.val==0 ，且当前节点为叶子节点，则找到目标，返回真
    # 
    
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        # flag = False
        def dfs(root:TreeNode,targetSum:int,depth:int):
            # nonlocal flag
            
            # 终止条件1，空值处理，此处不作为真值的判断
            if root is None :
                return False
            
            # 终止条件2，真值判断逻辑，说明找到叶子节点
            if targetSum-root.val==0 and (root.left is None and root.right is None):
                # flag = True 
                return True
            # 进行子节点的迭代
            left = dfs(root.left,targetSum-root.val,depth+1)
            right = dfs(root.right,targetSum-root.val,depth+1)
            
            # 终止条件3、返回左右节点的结果，向上层传递
            return max(left,right)
        
        return  dfs(root,targetSum,0)
        # return flag
    

