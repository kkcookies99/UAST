 class Solution {
public:
    vector<int> arr;
    vector<int> XXX(TreeNode* root) {
        if(root!=NULL){
           if(root->left){
               XXX(root->left);
           }
           arr.push_back(root->val);
           if(root->right){
               XXX(root->right);
           }
        }
        return arr;   
        
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


