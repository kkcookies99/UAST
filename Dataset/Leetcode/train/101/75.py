 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        q = []
        q.append(root)
        q.append(root)
        while len(q) != 0:
            t1 = q.pop()
            t2 = q.pop()
            if not t1 and not t2:
                continue
            elif t1 == None or t2 == None:
                return False
            else:
                if t1.val != t2.val:
                    return False
                else:
                    q.append(t1.left)
                    q.append(t2.right)
                    q.append(t1.right)
                    q.append(t2.left)
        return True
            

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


