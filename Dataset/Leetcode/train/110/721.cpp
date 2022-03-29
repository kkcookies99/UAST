 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        TreeNode* lp = root -> left;
        TreeNode* rp = root -> right;
        int ld;
        int rd;
        if(lp)
            ld = depth(lp) + 1;
        else
            ld = 1;
        if(rp)
            rd = depth(rp) + 1;
        else
            rd = 1;
        //cout << root -> val << " " << ld << " " << rd << endl;
        if(abs(ld - rd) > 1)
            return false;
        return XXX(lp) && XXX(rp);
        
    }
    int depth(TreeNode* r)
    {
        if(!r)
            return 0;
        int left = depth(r -> left);
        int right = depth(r -> right);
        return left > right ? left + 1 : right + 1;
    }
};

