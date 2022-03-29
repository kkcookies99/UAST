 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        int len = 0;
        ListNode *dummy = new ListNode(0);
        dummy->next = head;
        while(head){
            len++;
            head=head->next;
        }
        head = dummy;
        for(int i=0;i<len-n;i++){
            head = head->next;
        }
        head->next = head->next->next;
        return dummy->next;
    }
};

