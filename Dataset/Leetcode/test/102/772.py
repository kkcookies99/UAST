 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        cur = lastRight = root
        res = []
        queue = [root]
        
        while queue:
            lay = []
            length = len(queue)
            for i in range(length):
                #注意：索引要为0，因为每次循环都pop，目标元素就向前移动了
                if queue[0].left:                     
                    queue.append(queue[0].left)
                    cur = queue[0].left
                if queue[0].right:
                    queue.append(queue[0].right)
                    cur = queue[0].right
                
                queueTail = queue.pop(0)
                lay.append(queueTail.val)
                if lastRight == queueTail:
                    lastRight = cur
                    res.append(lay)
        return res

