 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* ori = new ListNode(0, head);
        ListNode* fast = ori, * slow = ori;
        while(n){
            fast = fast -> next;
            --n;
        }

        while(fast && fast -> next){
            fast = fast -> next;
            slow = slow ->next;
        }

        slow -> next = slow -> next -> next;
        return ori -> next;
    }
};

