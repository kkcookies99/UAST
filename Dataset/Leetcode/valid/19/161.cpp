 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        
        if(head == NULL) return head;
        
        ListNode* l = head;
        ListNode* r = head;
        ListNode* pre = head;
        
        while(n > 1) {
            r = r->next;
            n--;
        }
        
        while(r->next) {
            r = r->next;
            pre = l;
            l = l->next;
        }
        
        if(pre == l) {
            head = l->next;
            delete pre, l;
        } else {
            pre->next = l->next;
            delete l;
        }
        return head;
    }
};

