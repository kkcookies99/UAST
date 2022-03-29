 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        root_copy = copy.deepcopy(root)
        #----------------------------------------------------
        def search(root): #翻转二叉树
            if not root:
                return None
            left = search(root.left)
            right = search(root.right)
            root.left = right
            root.right = left
            return root
        root_flip = search(root_copy)
        #-------------------------------------------------------
        quene1, quene2 = [root], [root_flip]
        def hir(node1, node2):
            if not any(node1) and not any(node2):
                return True
            temp1, temp2 = list(), list()  #用来存储节点值
            next1, next2 = list(), list()  #用来存储节点
            for node in node1:
                if node:
                    if node.left:
                        temp1.append(node.left.val)
                        next1.append(node.left)
                    else:
                        temp1.append('no_node')
                        next1.append(False)
                    if node.right:
                        temp1.append(node.right.val)
                        next1.append(node.right)
                    else:
                        temp1.append('no_node')
                        next1.append(False)
            for node in node2:
                if node:
                    if node.left:
                        temp2.append(node.left.val)
                        next2.append(node.left)
                    else:
                        temp2.append('no_node')
                        next2.append(False)
                    if node.right:
                        temp2.append(node.right.val)
                        next2.append(node.right)
                    else:
                        temp2.append('no_node')
                        next2.append(False)
            if temp1!=temp2:
                return False
            if hir(next1, next2):
                return True
            return False
        if not hir(quene1, quene2):
            return False
        return True

