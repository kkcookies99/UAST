 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        # 层序遍历 判断每一次是否是回文即可，需要注意的是如果当前node不存在，append一个None值并且跳过此次循环
        # cur_level = [root]
        # while cur_level :
        #     tmp, next_level = [], []
        #     lenCur = len(cur_level)
        #     for node in cur_level :
                
        #         if not node :
        #             tmp.append(None)
        #             continue
        #         else :
        #             tmp.append(node.val)
                
        #         next_level.append(node.left)
        #         next_level.append(node.right)
        #     if tmp != tmp[::-1] :
        #         return False
        #     cur_level = next_level

        # return True

        def check(node1, node2) :
            if not node1 and not node2 : # 左右对应节点均为None，
                return True
            if not node1 or not node2 : # 左右对应节点只有一个为None
                return False
            
            if node1.val != node2.val : # 对应子节点如果不等则return False
                return False
            # 左节点的右子树和右节点的左子树， 左节点的左子树和右节点的右子树， 都要对应相等 或者为空 否则为False
            return check(node1.left, node2.right) and check(node1.right, node2.left)
        
        return check(root, root)

