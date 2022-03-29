 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return  True;
        left=[];
        right=[];
        def leftsearch(node,res):
            if node:
                res.append(node.val);
                leftsearch(node.left,res);
                leftsearch(node.right,res);
            else:
                res.append('null');
        def rightsearch(node,res):
            if node:
                res.append(node.val);
                rightsearch(node.right,res);
                rightsearch(node.left,res);
            else:
                res.append('null');
        leftsearch(root.left,left);
        rightsearch(root.right,right);
        if left==right:
            return True;
        else:
            return False;

