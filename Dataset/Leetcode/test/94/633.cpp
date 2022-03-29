 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        /*递归
        if(root==NULL) return {};
        vector<int> res = {};
        if(root->left!=NULL){ //左
            for(int a : XXX(root->left)){
                res.push_back(a);
            }
        }
        res.push_back(root->val);//根
        if(root->right!=NULL){//右
            for(int a : XXX(root->right)){
                res.push_back(a);
            }
        }
        return res;
        */
        /*迭代*/
        if(root==NULL) return {};
        stack<TreeNode*> S;
        vector<int> res;
        while(root||!S.empty()){
            while(root){ //左
                S.push(root);
                root = root->left;
            }
            root = S.top();
            S.pop();//防止了访问了左子树返回根后再次访问左子树
            res.push_back(root->val);//根
            root = root->right; //右
        }
        return res;
    }
};

