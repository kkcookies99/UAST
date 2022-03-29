 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* dummyHead = new ListNode(0);
        dummyHead->next = head;
        ListNode* slow = dummyHead, * fast = dummyHead;
        while (n-- && fast->next != nullptr) {
            fast = fast->next;
        }

        while (fast->next != nullptr) {
            slow = slow->next;
            fast = fast->next;
        }
        slow->next = slow->next->next;
        return dummyHead->next;
    }
};

/*先创建一个虚拟头节点指向头节点，初始化快慢指针指向虚拟头节点
快慢指针（先让快指针走n步）最后返回dummyHead->next
*/

