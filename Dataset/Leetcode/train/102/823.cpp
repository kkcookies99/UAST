 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==NULL)  return ans;
        queue<TreeNode*> qnt;
        qnt.push(root);
        
        while(!qnt.empty()){
            int count = qnt.size();
            vector<int> tmp;
            while(count-->0){
                root = qnt.front();
                qnt.pop();
                tmp.push_back(root->val);
                if(root->left)  qnt.push(root->left);
                if(root->right)  qnt.push(root->right);
            }
            ans.push_back(tmp);
        }
        return ans;
    }
};

