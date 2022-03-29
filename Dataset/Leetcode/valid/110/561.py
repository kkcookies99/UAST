class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root == None:
            return True
        def height(temproot):
            if temproot.left == None:
                leftheight = 0
            else:
                leftheight = height(temproot.left)
                if leftheight == -1:
                    return -1
            if temproot.right == None:
                rightheight = 0
            else:
                rightheight = height(temproot.right)
                if rightheight == -1:
                    return -1
            if abs(leftheight - rightheight) > 1:
                return -1
            return max(leftheight,rightheight) + 1
        if height(root) == -1:
            return False
        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


