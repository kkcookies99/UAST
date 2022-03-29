 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int>res;
        TreeNode* this_node = root;
        while(this_node != NULL){
            if(this_node->left != NULL && this_node->left->val != 0x7fffffff){ 
            //有左子树且左子树未访问，先让左子树的最右结点指向自己，再把指针交给左结点
                TreeNode* temp = this_node->left;
                while(temp->right != NULL){
                    temp = temp->right;
                }
                temp->right = this_node;
                this_node = this_node->left;
            }else{ //无左子树或左子树已访问，记录自己并访问右子树
                res.push_back(this_node->val);
                this_node->val = 0x7fffffff; //标记已访问
                this_node = this_node->right;
            }
        }
        return res;
    }
};

