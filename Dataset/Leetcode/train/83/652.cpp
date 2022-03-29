 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if (head == NULL) 
            return head;
        ListNode *a = head;
        ListNode *b = head->next;
        while(b != NULL){
            if( a->val == b->val){
                b = b->next; 
                a->next = b;
            }else{
                a = b;
                b = b->next;
            }     
        }
        return head;
    }
};

