 class Solution {
public:
    bool XXX(TreeNode* root) {
        long tool = LONG_MIN;
        int yesorno = 1;
        TreeNode *p = nullptr;
        while(root != nullptr)
        {
            if(root->left != nullptr)
            {
                p = root->left;
                while(p->right != nullptr && p->right != root) p = p->right;
                if(p->right == nullptr)
                {
                    p -> right = root;
                    root = root->left;
                }
                if(p->right == root)
                {
                    if(root->val <= tool) yesorno = 0;
                    tool = root->val;
                    root = root->right;
                    p->right = nullptr;
                }
            }
            else
            {
                if(root->val <= tool) yesorno = 0;
                tool = root->val;
                root = root->right;
            }   
        }
        if(yesorno == 1)return true;
        else return false;
    }
};

