 bool XXX(struct TreeNode* p, struct TreeNode* q){
    if (p == NULL && q == NULL)
        return true;
    
    if (p == NULL || q == NULL)
        return false;
    
    if (p -> val == q -> val) {
        if (! XXX(p -> left, q -> left)) return false;
        if (! XXX(p -> right, q -> right)) return false;
        return true;
    }

    return false;
}

