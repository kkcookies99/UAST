 class Solution {
public:
    bool judge(TreeNode* root,int sum){
        if(root->left == NULL && root->right==NULL){
            if(sum == root->val)
                return true;
            else
                return false;
        }else{
            int cur = sum - root->val;
            if(root->left){
                bool left = judge(root->left,cur);
                if(left)
                    return true;
            }
            if(root->right){
                bool right = judge(root->right,cur);
                if(right)
                    return true;
            }
            return false;
        }
    }
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL)
            return  false;
        return judge(root,sum);
    }
};

