class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> vec;
        queue<TreeNode*> que;
        vector<int> a;
        int i;
        if(!root) {
            vec = {};
            return vec;
        }
        que.push(root);
        while(!que.empty()){
            i = que.size();
            while(i>0){
                root = que.front();
                que.pop();
                a.push_back(root->val);
                if(root->left)  que.push(root->left);
                if(root->right) que.push(root->right);
                i--;
            }
            vec.push_back(a);
            a = {};
        }
        return vec;
    }
};

