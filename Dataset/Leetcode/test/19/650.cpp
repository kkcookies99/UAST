 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(head->next == nullptr && n == 1) return nullptr;
        ListNode * one = head;
        ListNode * two = head;
        //记录one前面的一个节点
        ListNode * oneFront = nullptr;
        int num = 1;
        while(two) {
            if(num <= n) {
                ++num;
                two = two->next;
            }
            else {
                ++num;
                oneFront = one;
                two = two->next;
                one = one->next;
            }
        }
        if(num == n+1) {
            head = head->next;
            return head;
        }
        
        oneFront->next = one->next;
        return head;

    }
};```

执行用时：0 ms, 在所有 C++ 提交中击败了100.00%的用户

内存消耗：10.5 MB, 在所有 C++ 提交中击败了41.82%的用户

