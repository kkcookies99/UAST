 class Solution {
public:
    bool XXX(TreeNode* root) {
        TreeNode * stk[10001],* temp = NULL;
        int start = 0; 
        while(start != 0 || root)
        {
            if(root)
            {
                stk[start ++] = root;
                root = root -> left;
            }
            else
            {
                root = stk[-- start];
                if(temp && temp -> val >= root -> val)
                    return false;
                temp = root;
                root = root -> right;
            }
        }
        return true;   
    }
};

