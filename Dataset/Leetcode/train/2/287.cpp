ListNode* XXX(ListNode* l1, ListNode* l2) {
    ListNode *retRoot = nullptr;
    
    //遍历
        ListNode *temp1 = l1;
        ListNode *temp2 = l2;
        ListNode *temp  = nullptr;
        ListNode *newNode = nullptr;
        int bAddOne = 0;
        int byteL1 = 0;
        int byteL2 = 0;
        while (bAddOne || temp1 || temp2) {
            if (temp1) {
                byteL1 = temp1->val;
                temp1 = temp1->next;
            }
            else {
                byteL1 = 0;
            }
            
            if (temp2) {
                byteL2 = temp2->val;
                temp2 = temp2->next;
            }
            else {
                byteL2 = 0;
            }
            
            //当前结点数值
            int curr = (bAddOne + byteL1 + byteL2)%10;
            bAddOne  = (bAddOne + byteL1 + byteL2)/10;
            
            //创建新链表
            newNode = new ListNode(curr);
            if (!retRoot) {
                retRoot = newNode;
            }
            else {
                temp->next = newNode;
            }
            temp = newNode;
        }
    return retRoot;
}

