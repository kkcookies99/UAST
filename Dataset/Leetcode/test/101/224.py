 class Solution:
    def XXX(self, root):
        """
        队列
        :param root:
        :return:
        """

        if not root:
            return True

        node_queue = [root.left, root.right]  # 在空队列中加入左子树和右子树

        while node_queue:
            left = node_queue.pop(0)          # 依次弹出两个元素
            right = node_queue.pop(0)

            if not right and not left:        # 如果均为空，继续下一个循环
                continue
            if not right or not left:         # 如果只有一个为空，返回False
                return False

            if left.val != right.val:         # 都非空，再判断值是否相等
                return False

            node_queue.append(left.left)      # 将两个左右子树的左右子树逆序加入队列
            node_queue.append(right.right)
            node_queue.append(left.right)
            node_queue.append(right.left)
            #node_queue.extend([left.left, right.right, left.right, right.left])   或者用这一句话写

        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


