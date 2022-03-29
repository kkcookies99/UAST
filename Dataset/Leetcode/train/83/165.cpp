class Solution {
public:
    ListNode* XXX(ListNode* head) {
            ListNode *temp = head;
            ListNode *cur = temp;
            while(cur!=nullptr&&cur->next!=nullptr){
                if(cur->val==cur->next->val){
                    cur->next = cur->next->next;
                }
                else{
                    cur = cur->next;
                }
            }

            return temp;
    }
};

