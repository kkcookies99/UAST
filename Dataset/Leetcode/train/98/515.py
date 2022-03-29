 class Solution(object):
    def XXX(self, root):
        #二叉搜索树中序遍历是升序的
        res = []
        if root == None:
            return True
        stack = []
        cur = root
        while cur:
            stack.append(cur)
            cur = cur.left
        while stack != []:
            tmp = stack.pop()
            if res != [] and tmp.val <= res[-1]:
                return False
            res.append(tmp.val)
            if tmp.right:
                tmp = tmp.right
                while tmp:
                    stack.append(tmp)
                    tmp = tmp.left
        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


