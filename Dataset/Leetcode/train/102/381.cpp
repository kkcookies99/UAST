class Solution {
public:
    void dfs( TreeNode* root,int height){
        if(height+1>res.size()){
            res.push_back({});
        }
        res[height].push_back(root->val);
        if(root->left!=nullptr){
            dfs(root->left,height+1);
        }
        if(root->right!=nullptr){
            dfs(root->right,height+1);
        }
    }
    
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root){
            return res;
        }
        int height=0;
        dfs(root,height);
        return res;
    }
private:
 vector<vector<int>> res;
};

