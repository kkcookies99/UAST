 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode dummyHead(0);
        dummyHead.next = head;
        ListNode *p = &dummyHead;
        ListNode *q = &dummyHead;
        
        while( n--) {
            q = q->next;
        }
        
        while(q->next) {
            p = p->next;
            q = q->next;
        }
        
        p->next = p->next->next;
        
        return dummyHead.next;
    }
};

