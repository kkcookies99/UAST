class Solution {
public:      
    vector<vector<int>> XXX(TreeNode* root) {
        if(root==nullptr) return {};
        vector<vector<int>> ans;
        helper(root,ans,0);
        return ans;
    }
    void helper(TreeNode* root,vector<vector<int>>& ans,int d){
        if(root==nullptr) return;
        if( d>=ans.size()){
            ans.push_back(vector<int> {});
        }
        ans[d].push_back(root->val);
        helper(root->left,ans,d+1);
        helper(root->right,ans,d+1);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


