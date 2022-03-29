 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ret=[]
        que = collections.deque()
        cur = root
        while que or cur:
            if cur:
                que.append(cur)
                cur = cur.left
            else:
                cur = que.pop()
                ret.append(cur.val)
                cur = cur.right
        return ret

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


