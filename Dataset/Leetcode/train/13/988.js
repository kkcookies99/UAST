 var XXX = function(s) {
    var map={
        'I':1,
        'V':5,
        'X':10,
        'L':50,
        'C':100,
        'D':500,
        'M':1000
    };
    var sum = 0;
    for(var i=0; i<s.length;i++){
        if(i<s.length-1) {
            if(map[s[i+1]]/map[s[i]]==5) {
                sum += 4*map[s[i]];
                i++;
            } else if(map[s[i+1]]/map[s[i]]==10){
                sum+=9*map[s[i]];
                i++;
            }else sum += map[s[i]];
        } else {
            sum += map[s[i]];
        }
    }
    return sum;
};

