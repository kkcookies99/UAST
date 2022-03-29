class Solution {
public:
    //广度优先遍历
    int XXX(TreeNode* root) {
        queue<TreeNode*> que;
        que.push(root);
        if(root==nullptr) return 0;
        int i,j=0;
        while(!que.empty()){
            i = que.size();
            while(i>0){
                root = que.front();
                que.pop();
                if(root->left) que.push(root->left);
                if(root->right) que.push(root->right);
                if(!root->left && !root->right) return ++j;
                i--;
            }
            j++;
        }
        return j;
    }
};

