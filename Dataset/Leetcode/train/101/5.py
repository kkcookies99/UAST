 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        
        queue = [root]
        
        while(queue):
            next_queue = list()
            layer = list()
            for node in queue:
                if not node:
                    layer.append(None)
                    continue
                next_queue.append(node.left)
                next_queue.append(node.right)
                
                layer.append(node.val)
                
            if layer != layer[::-1]:
                return False
            queue = next_queue
            
        return True

