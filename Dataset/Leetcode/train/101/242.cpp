 class Solution {
public:
    bool XXX(TreeNode* root) {
        
        if (root->left==NULL && root->right==NULL) return true;
        else if (root->left==NULL || root->right==NULL) return false;

        TreeNode* rleft, * rright;
        stack<TreeNode*> sl, sr;
        sl.push(root->left);
        sr.push(root->right);

        //先分左右镜像遍历
        //再比较镜像位置是否有值、值是否相等
        while (sl.empty()!=true && sr.empty()!=true) {
            rleft = sl.top();
            sl.pop();
            rright = sr.top();
            sr.pop();

            if (rleft==NULL && rright==NULL) continue;
            else if (rleft==NULL || rright==NULL) return false;
            else if (rleft->val != rright->val) return false;
            else {
                //先进后出，保持逻辑上的左右
                sr.push(rright->right);
                sl.push(rleft->left);
                sr.push(rright->left);
                sl.push(rleft->right);
            }

        }

        return true;

    }
};

