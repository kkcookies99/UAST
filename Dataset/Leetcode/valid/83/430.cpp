 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *p = head; 
        for(p;p&&p->next;){
            if(p->val==p->next->val) {  
                ListNode *del = p->next;
                p->next=p->next->next;  // 重复元素，删除节点
                delete del;  // 释放内存
            }
            else {
                p = p->next;  // 转换至下一个节点
            }
        }
        return head;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


