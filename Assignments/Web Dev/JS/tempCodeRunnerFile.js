function map(arr, func) {
    while (arr[0] !== undefined) {
        x.push[func(arr[0])];
        return map(arr.slice(1, arr.length), func);
    }
}