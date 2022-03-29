class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        dic=collections.defaultdict(list)
        if not root:return []
        stack=collections.deque([(root,0)])
        while stack:
            node,i=stack.popleft()
            dic[i].append(node.val)
            if node.left:
                stack.append((node.left,i+1))
            if node.right:
                stack.append((node.right,i+1))
        return list(dic.values())

