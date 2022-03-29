 var XXX = function(s) {
    const sArray = s.split('');
    let temp = '';
    let max = 0;
    sArray.forEach(item => {
        const currentIndex = temp.indexOf(item);
        if (currentIndex !== -1) {
            temp = temp.substring(currentIndex + 1);
        }
        temp += item;
        max = Math.max(temp.length, max);
    });
    return max;
};

