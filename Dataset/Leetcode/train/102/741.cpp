 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        if(root==NULL) return res;
        queue<TreeNode*> que;
        TreeNode* tmp = root;
        que.push(tmp);
        while(!que.empty()){
            int size = que.size();
            vector<int> ress;
            for(int i=0;i<size;i++){
                tmp = que.front();
                que.pop();
                ress.push_back(tmp->val);
                if(tmp->left!=NULL) que.push(tmp->left);
                if(tmp->right!=NULL) que.push(tmp->right);
            }
            res.push_back(ress);
        }
        return res;
    }
};

