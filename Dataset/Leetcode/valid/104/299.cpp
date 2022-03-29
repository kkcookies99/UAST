class Solution {
public:
    //定义状态结构体
    struct Tree_statu{
        TreeNode *root;
        int depth;
        Tree_statu(int x,TreeNode* r):depth(x),root(r){}
    };
    //判断是否是叶子节点
    bool is_leaf(TreeNode* r){
        if(!(r->left)&&!(r->right)){
            return true;
        }
        return false;
    }
    int XXX(TreeNode* root) {
        if(!root)return 0;
        int max=0;
        queue<Tree_statu> queue0;
        Tree_statu t(1,root);
        queue0.push(t);

        while(!queue0.empty()){
            Tree_statu top=queue0.front();
            queue0.pop();
            if(is_leaf(top.root)){
                if(top.depth>max)max=top.depth;
            }

            if(top.root->left!=NULL){
                Tree_statu new_statu=top;
                new_statu.root=top.root->left;
                new_statu.depth++;
                queue0.push(new_statu);
            }
            if(top.root->right!=NULL){
                Tree_statu new_statu=top;
                new_statu.root=top.root->right;
                new_statu.depth++;
                queue0.push(new_statu);
            }
        }

        return max;
    }
};

