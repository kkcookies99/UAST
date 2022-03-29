class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr)
            return 0;
        int depth = 0;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int s = q.size();
            int count = 0;
            int flag = 0;
            while(count < s){
                TreeNode* cur = q.front();
                q.pop();
                if(cur->left == nullptr && cur->right == nullptr){
                    flag = 1;
                    break;
                }
                if(cur->left != nullptr)
                    q.push(cur->left);
                if(cur->right != nullptr)
                    q.push(cur->right);
                count++;
            }
            depth++;
            if(flag == 1)
                break;   
        }
        return depth;
    }
};

