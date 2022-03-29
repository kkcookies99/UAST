 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        deque = collections.deque()
        deque.append(root.left)
        deque.append(root.right)

        while deque:
            left_node = deque.pop()
            right_node = deque.pop()

            if not left_node and not right_node:
                continue
            if not left_node or not right_node or left_node.val != right_node.val:
                return False

            deque.append(left_node.left)
            deque.append(right_node.right)
            deque.append(left_node.right)
            deque.append(right_node.left)
        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


