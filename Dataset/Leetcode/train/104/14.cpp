class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL)
            return 0;
        int num = 0;
        queue<TreeNode *> que;
        que.push(root);
        while(!que.empty()){
            int n = que.size();
            for(int i = 0;i < n;++i){
                TreeNode *cur = que.front();
                if(cur->left != NULL)
                    que.push(cur->left);
                if(cur->right != NULL)
                    que.push(cur->right);
                que.pop();
            }
            num++;
        }
        return num;
    }
};

