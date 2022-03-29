var XXX = function(s) {
    let mapKey = {
        'I': 1,
        'V': 5,
        "X": 10,
        "L": 50,
        C: 100,
        D: 500,
        M: 1000,
    }
    let sArr = s.split('');
    let sum = 0;
    for (let i = 0; i <sArr.length; i++) {
        if (!sArr[i + 1]) {
            sum += mapKey[sArr[i]]
        }else if(mapKey[sArr[i]] >= mapKey[sArr[i+1]]) {
            sum += mapKey[sArr[i]];
        } else {
            sum = sum + mapKey[sArr[i + 1]] - mapKey[sArr[i]];
            i++;
        }
    }
    return sum;
};

