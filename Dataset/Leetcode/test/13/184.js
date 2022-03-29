var XXX = function(s) {
    var Json = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000,
        'IV': 4,
        'IX': 9,
        'XL': 40,
        'XC': 90,
        'CD': 400,
        'CM': 900
    }
    var arr = s.split('');
    var num = 0;
    for (var i = 0; i < arr.length; i++) {
        if ((arr[i] + arr[i + 1]) in Json) {
            num += Json[arr[i] + arr[i + 1]]
            i++;
        } else {
            num += Json[arr[i]];
        }
    }
    return num;
};

