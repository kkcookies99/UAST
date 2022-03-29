class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root){
            return 0;
        }
        queue<TreeNode*> q;
        q.push(root);
        int count=1;
        while (!q.empty()){
            int levelSize=q.size();
            for(int i=0;i<levelSize;++i){
                auto nextRoot=q.front();
                q.pop();
                if(nextRoot->left){
                    q.push(nextRoot->left);
                }
                if(nextRoot->right){
                    q.push(nextRoot->right);
                }
                if(!nextRoot->left&&!nextRoot->right){
                    return count;
                }
            }
            ++count;
        }
        return count;   
    }
};

