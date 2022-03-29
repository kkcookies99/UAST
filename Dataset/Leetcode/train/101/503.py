 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root is None:
            return True
        def invertTree(root):
            if root is None:
                return root
            temp = root.left
            root.left = invertTree(root.right)
            root.right = invertTree(temp)
            return root
        def is_equal(root1, root2):
            if root1 is None and root2 is not None:
                return False
            if root2 is None and root1 is not None:
                return False
            if root1 is None and root2 is None:
                return True
            if root1.val != root2.val:
                return False
            if is_equal(root1.left, root2.left) and is_equal(root1.right, root2.right):
                return True
        return is_equal(root.left, invertTree(root.right))
     

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


