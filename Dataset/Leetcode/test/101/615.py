 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        
        q_node = [(1, root)]
        dct = defaultdict(list)

        while q_node:
            length = len(q_node)
            while length > 0:
                level, node = q_node.pop(0)
                length -= 1
                if node:
                    dct[level].append(node.val)
                    q_node.append((level+1, node.left)) 
                    q_node.append((level+1, node.right))
                else:
                    dct[level].append(-1)
            level += 1
        #print(dct)
        for key in dct.keys():
            if dct[key] != dct[key][::-1]:
                return False
        return True

