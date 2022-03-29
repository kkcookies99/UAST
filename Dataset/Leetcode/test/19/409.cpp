 class Solution {
public:
        ListNode* XXX(ListNode* head, int n) {
                ListNode HEAD;
                HEAD.next = head;
                deleteNode(&HEAD, head, n);
                return HEAD.next;
        }

        int deleteNode(ListNode* pre, ListNode* cur, int &n){
                int temp;
                if (cur->next)
                        temp = deleteNode(cur, cur->next, n) + 1;
                else
                        temp = 1;
                if (temp == n){
                        pre->next = cur->next;
                        delete cur;
                }
                return temp;
        }
};

