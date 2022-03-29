class Solution {
public:
    int HeightDifference(TreeNode* root){
        //如果返回一个自然数，代表当前树平衡，返回值就是当前最大高度
            //树空
        if(!root)
            return 0;
            //树不空
            //看孩子，来算当前最大高度。注意：也可能无孩子，因此>=0要取等，此时就返回1。
            //当左子树平衡&&右子树平衡&&左右子树高度差小于2时，那么当前树平衡，孩子最大高度加1。
            //重点：记录高度，孩子高度要选最大的。
        int heightleft=HeightDifference(root->left);
        int heightright=HeightDifference(root->right);
        if(heightleft>=0 && heightright>=0 && abs(heightleft-heightright)<2)
            return max(heightleft,heightright)+1;

        //如果返回-1，代表当前树不平衡
        return -1;
    }

    bool XXX(TreeNode* root) {
        if(HeightDifference(root)<0)
            return false;
        return true;
    }
};

