 class Solution {
public:
    bool result = true;
    void preOrderAndNewOrder(TreeNode* t1, TreeNode* t2){

        if((t1 == NULL) && (t2 == NULL))//都为空，遍历到底部
            return;
        else if(t1 == NULL || t2 == NULL){//仅有一个遍历到底，则不对称
            result = false;
            return;
        }
        if(t1->val != t2->val){
            result = false;
            return;
        }
        preOrderAndNewOrder(t1->left, t2->right);
        preOrderAndNewOrder(t1->right, t2->left);
    }

    bool XXX(TreeNode* root) {
       //将前序遍历：根左右；结合新遍历：根右左
       TreeNode* t1 = root;
       TreeNode* t2 = root;
       preOrderAndNewOrder(t1, t2);
       return result;
    }
};

