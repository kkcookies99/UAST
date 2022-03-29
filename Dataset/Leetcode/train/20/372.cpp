 class Solution {
public:
  bool XXX(string s) {
        if(s.length()%2 != 0)
        return false;
        struct stack{
            char ch;
            struct stack *next;
        };
        char temp;
        struct stack* head;
        head = new struct stack;
        head -> next =NULL;
        struct stack *fir;
        struct stack *temp1;
        for(int i = 0;i < s.length();i++)
        {
            if(s[i]=='{'||s[i]=='['||s[i]=='(')
            {   temp = s[i];
                fir = new struct stack;
                fir -> ch = temp;
                fir -> next = head -> next;
                head -> next = fir;
            }
            else if(s[i]=='}'||s[i]==']'||s[i]==')')
            {
                if(head -> next != NULL)
                {   
                    temp1 = head -> next;
                    temp = temp1 -> ch;
                    head -> next = temp1 -> next;
                    delete temp1;
                    if(s[i]==']')
                        if(temp != '[')
                            return false;
                    if(s[i]=='}')
                        if(temp != '{')
                            return false;
                    if(s[i]==')')
                        if(temp != '(')
                            return false;
                    
                }
                else return false;
                
            }
            


        }
        if(head -> next == NULL)
            return true;
        else 
            return false;
    }
};

