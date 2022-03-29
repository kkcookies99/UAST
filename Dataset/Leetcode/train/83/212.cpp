class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode fakeHead(INT_MIN, head);
        ListNode *pre = &fakeHead, *p = head;
        while (p) {
            if (pre->val == p->val) {
                pre->next = p->next;
                delete p;
            } else {
                pre = p;
            }
            p = pre->next;
        }
        return fakeHead.next;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


