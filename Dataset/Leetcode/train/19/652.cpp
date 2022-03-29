 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* prep[30];
        int sum = 0;
        while (head != nullptr) {
            prep[sum++] = head;
            head = head->next;
        }
        if (sum == n) {  return prep[sum-n]->next; }
        else if (n == 1){
            prep[sum-1-n]->next = nullptr;
        } else {
            prep[sum-1-n]->next = prep[sum+1-n];
        }
        return prep[0];
    }
};

