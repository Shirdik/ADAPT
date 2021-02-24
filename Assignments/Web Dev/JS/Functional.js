// Basic Exercises
// Q1

function square(num) {
    return num ** 2;
}

function double(num) {
    return num * 2;
}

function composedValue(square, double, 5) {
    return square(double(5));
}

const x = composedValue(square, double, num)


// Q2
const x = function compose(num) {

    function square(num) {
        return num ** 2;
    }

    function double(num) {
        return num * 2;
    }

    return square(double(num));
}


// Q3
function isEven(num) { return !(num % 2); }

function find(arr, func) {
    for (let x of arr) {
        if (func(x)) {
            return x;
        }
    }
}

find([1, 3, 4, 5, 7, 9], isEven);


// Q4

function double(num) { return num * 2; }

function map(arr, func) {
    const newArr = [];
    for (let x of arr) {
        newArr.push(func(x));
    }
    return newArr;
}

const x = map([1, 2, 3, 4, 5], double);
//const x=[1,2,3,4,5].map(double); 


//Advanced Exercises
// Q1

function find(arr, func) {
    while (arr[0] !== undefined) {
        if (func(arr[0]))
            return arr[0];
        return find(arr.slice(1, arr.length), func);
    }
}

map([1, 2, 4, 5], (x) => !(x % 2));

// Q2
const x = [];

function map(arr, func) {
    while (arr[0] !== undefined) {
        x.push(func(arr[0]));
        return map(arr.slice(1, arr.length), func);
    }
}

map([1, 2, 4, 5], (x) => x * 2);

// Q3

function double(num) {
    return num * 2;
}

console.log(double);