 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        res_list = []
        
        def track(root):
            # print(res_list)
            if root:
                if not track(root.left):
                    return False
                if len(res_list) == 0:
                    res_list.append(root.val)
                else:
                    if root.val <= res_list[-1]:
                        return False
                    res_list.append(root.val)
                if not track(root.right):
                    return False

            return True

        return track(root)

