class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        result = []
        curLayer = 0
        queue = [[root, 0]]  # 下标用于记录层级
        while queue:
            cur, layer = queue.pop()
            if cur:
                queue.append([cur.right, layer+1])  # 孩子节点层级+1
                queue.append([cur.left, layer+1])
                try:
                    result[layer]
                except:
                    result.append([])

                result[layer].append(cur.val)
        return result

