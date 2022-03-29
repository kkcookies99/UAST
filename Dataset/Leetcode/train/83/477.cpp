 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head) return head;

        ListNode* last=head;
        ListNode* node=last->next;

        while(node) {
            if(last->val!=node->val) {
                last=node;
                node=node->next;
            } else {
                last->next=node->next;
                node=last->next;
            }
        }
        return head;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


