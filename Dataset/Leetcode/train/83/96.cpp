class Solution {
public:
    ListNode* GetNextList(ListNode* now)
    {
        ListNode* next;
        if(nullptr == now->next)
            return nullptr;
        cout << "value: " << now->val << ",next value: "<< now->next->val <<  endl;
        if(now->next->val == now->val)//当前链与下个链值相同
        {
            now->next = now->next->next;//扔掉下一个链
            cout << "through: " << now->val << endl;
        }
        else//值不同
        {
            cout << "lalalalalalalala " << endl;                   
            next = now->next;//下次循环判断下一个链
        }         
        GetNextList(next);
        return nullptr;
    }
    //
    ListNode* XXX(ListNode* head) {
        ListNode* next;
        if(nullptr == head){
            cout << "null" << endl;
            return head;
        }
        else{
            GetNextList(head);
            return head;          
        }        
    }
};

