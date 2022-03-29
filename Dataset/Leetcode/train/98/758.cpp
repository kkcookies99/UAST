 class Solution {
public:
    bool XXX(TreeNode* root) {
        vector<int> res;
        helper(root,res);
        set<int> test(res.begin(),res.end());
        vector<int> a;
        a.assign(test.begin(),test.end());
        return res==a;
    }
    void helper(TreeNode* root, vector<int>&res)
    {
        if (root==NULL) return;
        helper(root->left,res);
        res.push_back(root->val);
        helper(root->right,res);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


