class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr)
            return 0;
        int l = XXX(root->left) + 1;
        int r = XXX(root->right) + 1;
        return (l > r ? l : r);

    }
};


class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr)
            return 0;
        int dept = 0;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int size = q.size();
            int count = 0;
            while(count < size){
                TreeNode* t = q.front();
                q.pop();
                count++;
                if(t->left != nullptr)
                    q.push(t->left);
                if(t->right != nullptr)
                    q.push(t->right);
            }
            dept++;
        }
        return dept;
    }
};

