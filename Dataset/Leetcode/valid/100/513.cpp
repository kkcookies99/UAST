 class Solution {
public:
    static void pre(TreeNode* root,vector<int>& vec)
    {
        if(root==nullptr)
        {
            vec.push_back(0);
            return;
        }
        vec.push_back(root->val);
        pre(root->left,vec);
        pre(root->right,vec);
    }
    bool XXX(TreeNode* p, TreeNode* q) {
        vector<int> p_arr,q_arr;
        pre(p,p_arr);
        pre(q,q_arr);
        if(p_arr.size()!=q_arr.size())
            return false;
        for(int i = 0 ; i < p_arr.size() ; i++)
            if(p_arr[i]!=q_arr[i])
                return false;
        
        return true;
    }
};

