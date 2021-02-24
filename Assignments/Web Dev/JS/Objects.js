// JavaScript Objects
// Q1

const Rectangle = { width: '10', height: '20' };
Rectangle.height;
Rectangle.width;
Rectangle.height = '10';
Rectangle.width = '20';

// Q2
Rectangle.prototype.getArea = function() { return parseInt(this.width) * parseInt(this.height) };

// Q3
// Constructor
function Rectangle(width, height) {
    this.width = width;
    this.height = height;
    this.getArea = this.width * this.height;
};

const x = new Rectangle(10, 20);
x.height = 50;
x.getArea();
// The Area doesn't change because it was calculated when the object is being created. so, it doesn't change when other attributes of object are changed.


// Q4
function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

const shirdi = new person('shirdi', 'kummarakuntla');


// Q5
function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

const shirdi = new person('shirdi', 'kummarakuntla');
shirdi.middleName;
// This gives undefined as the person class doesn't have middleName attribute in it.
// This is very useful because, it's kind of handling the error by itself and alerting the devloper to change/update the value

// Q6
firstName = 'shirdi';
lastName = 'k';
var fullName = `${firstName} ${lastName}`;
eval(`${firstName} ${lastName}`);

// Q7

firstName = 'shirdi';
lastName = 'k';
var fullName = `${firstName} ${lastName}`;
parseJSON(fullName);


// 1
// const person = {
//     fname: 'Shirdi',
//     lname: 'k',
//     age: 20,
//     skills: ['badmintion', 'skating', 'photography'],
//     address: {
//         city: 'chillakallu',
//         pincode: 521178
//     },
//     dateOfBirth: '28/2/2000',
//     married: false,
//     profession: 'Analyst'
// }

function person(fname, lname, age, skills, dateofbirth, address, married, profession) {
    this.fname = fname;
    this.lname = lname;
    this.age = age;
    this.skills = skills;
    this.dateofbirth = dateofbirth;
    this.address = address;
    this.married = married;
    this.profession = profession;

}

person1 = new
person("nikhil", "goud", 22, ["c"], "24/10/1996", { city: "hyderabad", pincode: "521185" }, "false", "sr analyst")
person2 = new
person("harish", "chinna", 21, "HTML", "08/06/1997", { city: "Ameerpet", pincode: "500038" }, "false", "jr analyst")

console.log(person1);
console.log(person2);

// 2

amithab = new
person("amithab", "bachan", 22, ["c"], "24/10/1996", { city: "hyderabad", pincode: "521185" }, "false", "sr analyst")
abhisheik = new person("abhisheik", 21, "HTML", "08/06/1997", "false", "jr analyst")
var abhisheik = Object.create(amithab);

console.log(amithab);
console.log(abhisheik.lname);
console.log(abhisheik.address);

// 3
Aaradhya = new person("aaradhya", amithab.age, "HTML", "08/06/1997", abhisheik.married, amithab.profession);

console.log(Aaradhya);


// 4
function BankAccount(accountNumber, accountHolderName, accountBalance, isSalary = false, odLimit = NaN) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountBalance = accountBalance;
    this.isSalary = isSalary;
    this.odLimit = odLimit;
}



BankAccount.withDraw() = function(drawAmount) {
    if (this.isSalary) {
        if (this.accountBalance > drawAmount) {
            this.accountBalance -= drawAmount;
            console.log('Withdrawn Successfully');
        }
        console.log('Insufficient Funds');
    } else {
        if (drawAmount < accountBalance + odLimit) {
            this.accountBalance -= drawAmount;
            console.log('Withdrawn Successfully');
        }
        console.log('Insufficient Funds');
    }
}

// BankAccount.CurrentBalance() = function() {
//     return this.accountBalance;
// }

var account1 = new BankAccount(1, 'Shirdi', 1000, true);
var account1 = new BankAccount(2, 'Venkat', 5000, false, 1000);