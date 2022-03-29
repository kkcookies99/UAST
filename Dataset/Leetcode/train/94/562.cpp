 class Solution {
public:
    vector<int> s;
    vector<int> XXX(TreeNode* root) {
        if(root == NULL){
            return s;
        }
        if(root->left != NULL){
            XXX(root->left);
        }
        s.push_back(root->val);
        if(root->right != NULL){
            XXX(root->right);
        }
        return s;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


