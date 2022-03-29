class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==NULL||head->next==NULL) return head;
        ListNode*pCurrent=head;
        int temp;
        while(pCurrent&&pCurrent->next)//存在两个元素
        {   
            ListNode*pNode=pCurrent->next;//设置一个临时指针
            temp=pCurrent->val;
            if(temp==pNode->val)//相等时，处理
            { 
                while(pNode&&temp==pNode->val)
               {
                 pNode=pNode->next;   
                }
                pCurrent->next=pNode;
                pCurrent=pCurrent->next;
            }
            else//不相等时，处理
            {
                pCurrent=pCurrent->next;
            }
        }
        return head;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


