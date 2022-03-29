 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ret = []
        q = [(root, False)]

        while len(q) > 0:
            node, poped = q.pop()
            if poped: ret.append(node.val)
            elif node:
                for _node, _poped in [(node.right, False),\
                    (node, True), (node.left, False)]:
                    if _node: q.append((_node, _poped))
        return ret

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


