class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        if(root==NULL) return res;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int len=q.size();
            vector<int> temp;
            for(int i=0;i<len;i++){
                TreeNode* node = q.front();q.pop();
                temp.push_back(node->val);
                if(node->left!=NULL) q.push(node->left);
                if(node->right!=NULL) q.push(node->right);
            }
            res.push_back(temp);
        }
        return res;
    }
};

