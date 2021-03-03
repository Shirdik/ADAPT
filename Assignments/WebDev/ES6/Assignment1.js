// Q1
// ______________________________________________________________
const c = 20;
c = 25; // -->This throws an erroe because constant cannot change it's value.


// Q2
// ______________________________________________________________

function scopeCheck() {
    let x = 1;
}
console.log(x);
// This also throws an error as the x is not in scope of window, it was just in the function


// Q3
// ______________________________________________________________
const Order = {
    id: 0,
    title: '',
    price: 0,
    printOrder() { console.log(id, title, price) },
    getPrice() { console.log(price) },
    assign(id, title, price) {
        this.id = id;
        this.title = title;
        this.price = price;
    },
};

Order.assign(1, 'WOW', 200);
console.log(Order);


// Q4
// ______________________________________________________________
let names = ['Tom', 'Jerry', 'Spike'];
const convert = (names) => {
    let namesObj = [];
    for (let name of names) {
        namesObj.push(`name: ${name}, length: ${name.length}`);
    }
    return namesObj;
}

// Q5
// ______________________________________________________________
// a
const add = (a, b) => a + b;
// b
function userFriends(username, ...friends) {
    console.log(username, friends);
}
// c
function printCapitalNames(...names) {
    const nameArr = [...names];
    for (let name of names) {
        console.log(name.toUpperCase());
    }
}

// Q6
// ______________________________________________________________
const name = 'Shirdi';
const laptopModel = 'DELL Inspiron 7570';
const deskNo = '5';
console.log(`Name: ${name}, Desk No:${deskNo}, Laptop Model: ${laptopModel}`);

// Q7
// ______________________________________________________________
// a
let names = ['Tom', 'Jerry', 'Spike', 'Duke'];
const { first, second, third, fourth } = names;
console.log(third);
// b
const Organisation = {
    name: '',
    address: {
        pinCode: 521178
    }
}
const { address } = Organisation;
const { pinCode } = address;

// Q8
// ______________________________________________________________
class Account {
    static bal = 0;
    constructor(id, name, balance, type) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.type = type;
        Account.bal += balance;
    }
}
class SavingsAccount extends Account {
    constructor(id, name, balance) {
        super(id, name, balance, 'Savings');
    }
}
class CurrentAccount extends Account {
    constructor(id, name, balance) {
        super(id, name, balance, 'Current');
    }
}