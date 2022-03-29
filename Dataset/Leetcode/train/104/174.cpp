class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        queue<TreeNode*> q;
        q.push(root);
        int times=0;
        while(!q.empty()){
            int l=q.size();
            for(int n=1;n<=l;n++){
            auto temp=q.front();q.pop();
            if(temp->left) q.push(temp->left);
            if(temp->right) q.push(temp->right);
            }
            times++;
        }
        return times;
    }
};

