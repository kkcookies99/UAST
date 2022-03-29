class Solution {
public:
    vector<int> s[1000]; 
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root) return vector<vector<int>>();
        return vector<vector<int>>(s, s + dfs(root,0));
    }

    int dfs(TreeNode* root, int lev){
        if(!root) return 0;
        s[lev].push_back(root->val);
        return 1 + max(dfs(root->left, lev + 1),dfs(root->right, lev + 1));
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


