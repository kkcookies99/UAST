 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* p = head, *head1 = head;
        ListNode* q = nullptr;
        int k = 0;
        while(p){
            p = p->next;
            k++;
        }
        p = head;
        if(n==k) return p = head->next;
        while(n--){
            p = p->next;
        }
        while(p){
            p = p->next;
            q = head;
            head = head->next;
        }
        q->next = head->next;
        return head1;
    }
};

