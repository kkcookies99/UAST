class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* ptr=head;
        while(head!=nullptr&&head->next!=nullptr){
            while(head!=nullptr&&head->next!=nullptr&&head->val==head->next->val){
                head->next=head->next->next;
            }
            head=head->next;
        }
        return ptr;
    }
};

