 class Solution {
public:
    string XXX(string s) {
        int size = s.size();

        if(size <= 1){
            return s;
        }

        int startIdx = 0;
        int endIdx = 0;

        for(int i=0;i<size;i++){
            int head = i, tail = i;

            // set the i-th element as the center element
            // odd substring size
            while(tail < size && head >= 0){
                if(s[head] == s[tail]){
                    head--;
                    tail++;
                }
                else{
                    break;
                }
            }

            // restore valid head and tail
            head++;
            tail--;

            if((tail-head+1) > (endIdx-startIdx+1)){
                startIdx = head;
                endIdx = tail;
            }

            // set the i-th element as one of the center elements
            // even substring size
            if(i+1 < size && s[i]==s[i+1]){
                head = i;
                tail = i+1;
                while(tail < size && head >= 0){
                    if(s[head] == s[tail]){
                        head--;
                        tail++;
                    }
                    else{
                        break;
                    }
                }

                // restore valid head and tail
                head++;
                tail--;

                if((tail-head+1) > (endIdx-startIdx+1)){
                    startIdx = head;
                    endIdx = tail;
                }
            }

        }

        return s.substr(startIdx, endIdx-startIdx+1);
    }
};

