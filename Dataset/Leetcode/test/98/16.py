 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        # 思路: 利用BST中序遍历的特性.
        # 中序遍历输出的二叉搜索树节点的数值是有序序列
        candidate_list = []
        
        def __traverse(root: TreeNode) -> None: 
            nonlocal candidate_list
            if not root: 
                return 
            __traverse(root.left)
            candidate_list.append(root.val)
            __traverse(root.right)
            
        def __is_sorted(nums: list) -> bool: 
            for i in range(1, len(nums)): 
                if nums[i] <= nums[i - 1]: # ⚠️ 注意: Leetcode定义二叉搜索树中不能有重复元素
                    return False
            return True
        
        __traverse(root)
        res = __is_sorted(candidate_list)
        
        return res

