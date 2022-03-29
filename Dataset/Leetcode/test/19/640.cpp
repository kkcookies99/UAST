 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
//虚拟头节点 避免边界情况判断
        ListNode* T = new ListNode(0);
        T->next = head;
// 快慢指针
        ListNode *fast= T;
        ListNode *small = T;
// fast 先移动 n 次
        while(n){
            fast = fast->next;
            n--;
        }
// fast small 同时移动 一直到 fast->next 为空的时候
        while(fast->next){
            small = small->next;
            fast = fast->next;
        }
//连接        
        // cout<<small->val<<endl;
        small->next=small->next->next;

        return T->next;
    }
};

