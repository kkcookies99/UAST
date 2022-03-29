 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* quick_pointer = head;
        ListNode* slow_pointer = head;
        while(quick_pointer->next){
            quick_pointer=quick_pointer->next;
            if(n<=0)
                slow_pointer = slow_pointer->next;
            --n;
        }
        if(n<=0){
            slow_pointer->next = slow_pointer->next->next;
        }else{
            head = head->next;
        }
        return head;
    }
};

