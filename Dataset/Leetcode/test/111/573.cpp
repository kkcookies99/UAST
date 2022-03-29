class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr) return 0;
        queue<TreeNode*> Q;
        Q.push(root);
        int ans = 1;
        while(!Q.empty()){
            int size = Q.size();
            while(size--){
                auto cur = Q.front(); Q.pop();
                if(cur->left == nullptr && cur->right == nullptr) return ans;
                if(cur->left) Q.push(cur->left);
                if(cur->right) Q.push(cur->right);
            }
            ans++;
        }
        return ans;
    }
};

