 class Solution {
public:
    string XXX(int num) {
        int n=num;
        int flag=0;
        string mapsn[2]={"IXCM","VLD"};
        string mapsd[2]={"VLD","XCM"};
        string rom="";
        while(n/10!=0||n%10!=0){
            flag++;
            int t=n%10;
            if(t==4){
                rom.insert(0,1,mapsd[0][flag-1]);
                rom.insert(0,1,mapsn[0][flag-1]); 
            }else if(t==9){
                rom.insert(0,1,mapsd[1][flag-1]); 
                rom.insert(0,1,mapsn[0][flag-1]); 
            }else{
                if(t!=0){
                    int pref=t/5,suff=t%5;
                    for(int i=0;i<suff;i++){rom.insert(0,1,mapsn[0][flag-1]);}
                    for(int i=0;i<pref;i++){rom.insert(0,1,mapsd[0][flag-1]);}
                }
            }
            n/=10;
        }
        return rom;
    }
};

