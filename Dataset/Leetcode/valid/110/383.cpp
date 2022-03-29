class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        if(abs((depth(root->left)-depth(root->right)))<=1){                //如果俩兄弟满足深度差小于等于1的条件，那就再看是否这俩兄弟的子树也能满足该条件
            return XXX(root->left)&&XXX(root->right);
        }
        return false;                                                                              //如果不满足上述条件肯定false                              
    }

    int depth(TreeNode* root){
        if(!root) return 0;                               //空返回0
        else if(!root->left&&!root->right) return 1;      //孩子空返回1
        else  {
            return 1+ max(depth(root->left),depth(root->right));//本层深度=俩子树的最大深度+1
        }
    }
};

