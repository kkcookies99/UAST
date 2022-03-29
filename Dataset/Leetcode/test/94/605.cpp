 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        if(root == NULL)
            return {};
        TreeNode * cur1 = root;
        TreeNode * cur2 = NULL;
        vector<int> res;
        while(cur1 != NULL)
        {
            cur2 = cur1->left;
            if(cur2 != NULL)
            {
                while(cur2->right != NULL && cur2->right != cur1)
                    cur2 = cur2->right;
                if(cur2->right == NULL)
                {
                    cur2->right = cur1;
                    cur1 = cur1->left;
                    continue;
                }
                else
                    cur2->right = NULL;
            }
            res.push_back(cur1->val);
            cur1 = cur1->right;
        }
        return res;
    }
};

