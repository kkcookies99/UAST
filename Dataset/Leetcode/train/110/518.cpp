class Solution {
public:
    int count_height(TreeNode* root,int height){ // 返回以该节点为根结点的子树的最大深度；
        if(root == NULL) return height;
        else if(root -> left == NULL) return count_height(root -> right,height+1);
        else if(root -> right == NULL) return count_height(root -> left,height+1);
        else {
            return  count_height(root -> left,height+1) > count_height(root -> right,height+1) ? count_height(root -> left,height+1) : count_height(root -> right,height+1);
        }
    } 
    bool XXX(TreeNode* root) {
        int l_height = 0;
        int r_height = 0;
        if(root == NULL) return true;
     //   if(root -> left == NULL) return XXX(root -> left);
      //  if(root -> right == NULL)  return XXX(root -> right);
        else{
          l_height = count_height(root -> left,0);
          r_height = count_height(root -> right,0);
          if(l_height-r_height < -1 || l_height-r_height  > 1) return false;
        }
       return XXX(root -> left) && XXX(root -> right);
    }
    
  
};

