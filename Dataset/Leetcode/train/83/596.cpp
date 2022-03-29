 class Solution {
public:
    // 递归版本
    ListNode* XXX(ListNode* head) 
    {
        if (head == nullptr || head->next == nullptr) return head;
        ListNode *currNode = head->next;
        while (currNode != nullptr && currNode->val ==  head ->val) currNode = currNode->next;
        head->next = XXX(currNode);
        return head;
    }
};
