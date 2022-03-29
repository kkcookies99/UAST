class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* result = head;//返回的链表
        set<int>m;//记录已经有的数
        if(head==nullptr){return head;}//空链表
        m.emplace(head->val);//加一个数
        while (head->next != nullptr) {
            int valu = head->next->val;//获取下一个数
            if ( valu== *m.find(valu)) {//看看是否存在
                if (head->next->next != nullptr){
                    head->next = head->next->next;//逻辑上删除
                }else{
                    head->next = nullptr;//此时已到末尾，将尾部next赋值为空
                }
            }
            else {
                m.emplace(valu);//添加
                head = head->next;//指针后移
            }
        }
        return result;
    }
   
};

