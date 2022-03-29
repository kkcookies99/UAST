 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(!head) return NULL;
        ListNode *p = head;
        while(n!=0 && p->next!= NULL) {
            p = p -> next;
            n--;
        }
        if(n>1) return head;
        if(n==1) return head->next;
        ListNode *p2 = head;
        while(p->next) {
            p = p->next;
            p2 = p2->next;
        }
        p2->next = p2->next->next;
        return head;
    }
};

