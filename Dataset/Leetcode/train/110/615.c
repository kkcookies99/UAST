 bool XXX(struct TreeNode* root){
    if(root==NULL){
        return true;
    }
    int leftDeep=getMaxDeep(root->left);
    int rightDeep=getMaxDeep(root->right);
    if(abs(leftDeep-rightDeep)<=1){
        return XXX(root->left)&&XXX(root->right);
    }
    return false;
}

int getMaxDeep(struct TreeNode* root){
    if(root==NULL){
        return 0;
    }
    int leftDeep=getMaxDeep(root->left)+1;
    int rightDeep=getMaxDeep(root->right)+1;
    if(leftDeep>rightDeep){
        return leftDeep;
    }
    return rightDeep;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


