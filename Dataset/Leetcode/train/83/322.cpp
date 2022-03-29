class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *curNode = head;
        while(curNode) {
            ListNode *nextNode = curNode->next;
            while(nextNode && nextNode->val == curNode->val) {
                nextNode = nextNode->next;
            }
            curNode->next = nextNode;
            curNode = nextNode;
        }
        return head;
    }
};

