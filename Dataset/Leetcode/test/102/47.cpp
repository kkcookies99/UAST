class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        vector<int> temp;
        if(!root){
            return ans;
        }
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int count = q.size();
            for(int i=0; i<count; ++i){
                TreeNode* node = q.front();
                q.pop();
                temp.push_back(node->val);
                if(node->left){
                    q.push(node->left);
                }
                if(node->right){
                    q.push(node->right);
                }
            }
            ans.push_back(temp);
            temp=vector<int>();
        }
        return ans;
    }
    
};

