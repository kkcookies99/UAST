class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL){
            return 0;
        }else{
            queue<TreeNode*> que;
            que.push(root);
            int res = 0;
            while(!que.empty()){
                res++;
                int count = que.size();
                for(unsigned int i = 0;i < count;i++){
                    TreeNode* tmp = que.front();
                    que.pop();
                    if(tmp->left == nullptr && tmp->right == nullptr){
                        return res;
                    }
                    if(tmp->left != nullptr){
                        que.push(tmp->left);
                    }
                    if(tmp->right != nullptr){
                        que.push(tmp->right);
                    }
                }
            }
        }
        return 0;
    }
};

