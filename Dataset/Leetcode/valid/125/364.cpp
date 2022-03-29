 class Solution {
public:
    bool XXX(string s) {
        string news;
        for(char a:s){
            if(isalnum(a)) news+=tolower(a);
        }
        string news_revers = news;
        reverse(news.begin(),news.end());
        return news == news_revers;
    }
};

