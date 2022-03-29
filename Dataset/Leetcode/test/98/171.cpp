 class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        stack<TreeNode* >stk;
        while(root||stk.size()){
            while(root)
            {
                stk.push(root);
                root=root->left;
            }
            if(stk.size())
            {
                root=stk.top();
                stk.pop();
                res.push_back(root->val);
                root=root->right;
            }
        }
        return res;
    }
    bool XXX(TreeNode* root) {
        auto res=inorderTraversal(root);
        unordered_set<int> s;
        for(auto i:res) s.insert(i);
        if(s.size()!=res.size()) return false;
        if(is_sorted(res.begin(),res.end())) return true;
        else return false;
    }
};

