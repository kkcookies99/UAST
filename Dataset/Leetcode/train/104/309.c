int XXX(struct TreeNode* root){
    if(root == NULL){
		return 0;
	}else{
		int l = XXX(root->left);
		int r = XXX(root->right);
		return l > r ? 1+l : 1+r;
	}
}

作者：tan-suo-zhe-chen
链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/solution/jian-dan-li-kou-suan-fa-yi-shua-104-er-c-d0ti/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。```

