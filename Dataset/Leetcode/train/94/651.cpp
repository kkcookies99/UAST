 class Solution {
public:
vector<int> res;
    vector<int> XXX(TreeNode* root) {
        if(!root)   return {};
        if(root->left)    XXX(root->left);
        res.push_back(root->val);
        if(root->right)    XXX(root->right);
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


