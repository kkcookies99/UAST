 class Solution {
public:
    vector<int> res;
    vector<int> XXX(TreeNode* root) {
        if(!root) return vector<int>();
        dfs(root);
        return res;
    }
    void dfs(TreeNode* u){
        if(!u) return;
        if(u->left) dfs(u->left);
        res.push_back(u->val);
        if(u->right) dfs(u->right);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


