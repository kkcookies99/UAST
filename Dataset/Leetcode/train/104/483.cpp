class Solution {
public:
    int XXX(TreeNode* root) {
        int maxd = 0;
        if(!root) return maxd;
        queue<TreeNode*> que;
        que.push(root);
        while(!que.empty()){
            maxd++;
            int n = que.size();
            for(int i = 0; i < n; i++){
                TreeNode* head = que.front();
                que.pop();
                if(head->left) que.push(head->left);
                if(head->right) que.push(head->right);
            }
        }
        return maxd;
    }
};

