 class Solution {
public:
    bool XXX(TreeNode* root) {
        vector<int> ans;
        ergodic(root, ans);
        for(int i = 1; i < ans.size(); ++i){
            if(ans[i] <= ans[i-1]) return false;
        }
        return true;
    }

    void ergodic(TreeNode* root, vector<int>& ans){
        if(!root) return;
        ergodic(root->left, ans);
        ans.emplace_back(root->val);
        ergodic(root->right, ans);
    }
};


