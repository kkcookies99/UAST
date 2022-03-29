class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        int num = 1;
        queue<TreeNode*> q;
        queue<TreeNode*> tmp;
        q.push(root);
        while(true){
            while(!q.empty()){
                auto top = q.front();
                q.pop();
                if((!top->left)&&(!top->right)){
                    return num;
                }
                if(top->left) tmp.push(top->left);
                if(top->right) tmp.push(top->right);
            }
            swap(q, tmp);
            num++;
        }
        return num;
    }
};

