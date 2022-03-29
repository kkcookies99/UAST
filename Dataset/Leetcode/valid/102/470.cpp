class Solution {
public:
    vector<vector<int>> ans;
    vector<vector<int>> XXX(TreeNode* root) { 
        queue <TreeNode*> q;
        if(!root)
            return ans;
        q.push(root);
        while(!q.empty()){
            vector<int> level;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode* temp=q.front();
                level.push_back(temp->val);
                if(temp->left){
                    q.push(temp->left);
                }
                if(temp->right){
                    q.push(temp->right);
                }
                q.pop();
            }
            ans.push_back(level);
        }
        return ans;
    }
};

