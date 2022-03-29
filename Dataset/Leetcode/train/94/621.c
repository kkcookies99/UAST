 int* XXX(struct TreeNode* root, int* returnSize){
/* Vector & Stack Definiation */
#define RTN_SZ (1024)

    /* vector */
    int * rtn_vec = (int *) malloc (sizeof(int) * RTN_SZ);
    int r_sp = -1;

    /* stack */
    struct TreeNode * node_stk[RTN_SZ] = {NULL};
    int n_sp = -1;

    struct TreeNode * tmp = NULL;
    
    while (1)
    {
        while (root)
        {
            node_stk[++n_sp] = root;
            root = root->left;
        }

        if (n_sp == -1) break;

        tmp = node_stk[n_sp --];
        rtn_vec[++r_sp] = tmp->val;
        root = tmp->right;
    }

    *returnSize = (r_sp + 1);
    return rtn_vec;
}

