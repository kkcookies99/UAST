 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root:
            return self.check([root.left],[root.right])
        else:
            return True

    def check(self, L, R):
        L_all_none = L.count(None) == len(L)
        R_all_none = R.count(None) == len(R)
        if L_all_none and R_all_none:
            return True
        elif L_all_none or R_all_none:
            return False
        L_val = [node.val if node!=None else None for node in L]
        R_val = [node.val if node!=None else None for node in R]
        if L_val == R_val[::-1]:
            new_L =[]
            for i in L:
                if i==None:
                    new_L+=[None,None]
                else:
                    new_L+=[i.left, i.right]
            new_R =[]
            for i in R:
                if i==None:
                    new_R+=[None,None]
                else:
                    new_R+=[i.left, i.right]
            return self.check(new_L,new_R)
        
        else:
            return False

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


