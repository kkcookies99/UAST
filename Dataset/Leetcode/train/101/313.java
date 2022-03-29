 class Solution {
    public boolean XXX(TreeNode root) {
        return check(root);
    }
    
    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null)
        {
            return true;
        }
        else if (p == null || q == null)
        {
            return false;
        }

        if (p.val == q.val && check(p.left, q.right) && check(p.right, q.left))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean check(TreeNode root)
    {
        Stack<TreeNode> a = new Stack<>();
        Stack<TreeNode> b = new Stack<>();
        TreeNode p = root.left;
        TreeNode q = root.right;
        a.push(root);
        b.push(root);
        while (p != null || !a.empty() || q != null || !b.empty())
        {
            if (p != null && q != null)
            {
                a.push(p);
                b.push(q);
                p = p.left;
                q = q.right;
            }
            else if (p != null || q != null)
            {
                return false;
            }
            else
            {
                p = a.pop();
                q = b.pop();
                if (p.val != q.val)
                {
                    return false;
                }
                else
                {
                    p = p.right;
                    q = q.left;
                }
            }
        }
        return true;
    }
}

