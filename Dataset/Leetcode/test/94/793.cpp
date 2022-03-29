 class Solution {
public:
   vector<int> XXX(TreeNode* root) {
   vector<int> ivec;
   if(root == NULL) return;
        TreeNode *curr = root, *pre = root; //当前结点和前驱结点
        while(curr)
        {
            if(!curr->left){
                //curr左子节点不存在，则可直接输出curr
                ivec.push_back(curr->val);
                curr = curr->right;
            }else{
                //寻找curr的前驱节点
                pre = curr->left;
                while(pre->right!=NULL && pre->right != curr) pre = pre->right;
                //判断是应该“搭桥”还是“拆桥”
                if(pre->right == NULL){
                    pre->right = curr;
                    curr = curr->left;
                }else{
                    ivec.push_back(curr->val);
                    pre->right = NULL;
                    curr = curr->right;
                }
            }
        }
 return ivec;
}

