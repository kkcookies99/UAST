class Solution(object):
    def maxDepth(self, root):
        if root == None:
            return 0
        len_left = self.maxDepth(root.left)
        len_right = self.maxDepth(root.right)
        if len_left == -1 or len_right == -1:
            return -1
        if abs(len_left - len_right) <= 1:
            return max(len_right, len_left) + 1
        else:
            return -1
    
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """       
        if root == None:
            return True        
        if self.maxDepth(root) == -1:
            return False
        else:
            return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


