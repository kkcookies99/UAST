 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head == NULL){
            return head;
        }
        ListNode* p, *q;
        p = head;
        q = p->next;
        while(p != NULL){
            while(q != NULL && q->val == p->val){
                q = q->next;
            }
            p->next = q;
            p = q;
        }
        return head;
    }
};

