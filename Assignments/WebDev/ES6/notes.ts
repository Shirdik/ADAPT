/*

Typescript is used most for the web-based applications, for having the features of the JavaScript and convering the cons of it.
-->TypeScript is Type Specific
-->TypeScript supports IDE
-->TypeScript supports Intellisense 
------>Many other features

------------------------------------------------------------------
let c:number=20;
    |or|
let c:number;
--> now c is type specific, we cannot assign any other datatype.However, if the type is not assigned and the variable is not initalised, then the var is not type specific.
let x;
  |or|
let x:any;
x=10;
x='hwllo';
x=true;
x();
x.toUpperCaase();

-->The keyword any is used when the type of the var is not necessary or when the dev doesn't know the type of the data.

-->There is another way of doing this, with 'unknown' keyword, which allows the developer only to access the data not the properties. To get the properties we have to cast the var into the type.
let x:unknown;
x='shirdi';
x.toUppercase() --> This causes error, because it is an unknown type.

CASTING:__________________________________________________________
(x as string).toUpperCase()--> this casts the data into a string type. 

let x=number | boolean; --> with this, now the x can store a number or a boolean type of value.

FUNCTIONS WITH TYPES:_____________________________________________

function add(a:number, b:number): number{
    return a+b;
}

const add=(a:number, b:number):number => a+b;

--> In the above functions, the arguments are of type number and the return type of the function is a number.

------------------------------------------------------------------
--> In TypeScript every argument is need to call the function, whereas in js, the arguments are treated as undefined if they are not passed.

--> To work with optional parameters, we use ? as shown in the below example

const add=(a:number, b:?number):number => b ? a+b : a;
                    ^^^^^^^^^^
                    ||||||||||

add(5);--> now the other argument is treated as undefined in ts.
add(5,6);

------------------------------------------------------------------

function hasName(obj:any): obj is {name:string}{
    return !!obj &&
           typeof obj === 'object' &&
           'name' in obj
}

--> In the above function, the return type is an object which has a name property in string type.
------------------------------------------------------------------
INTERFACE:

These are used to reduce the code complextity.

interface Person{
    firstname:string,
    lastname:?string
}

let p={
    firstname:'shirdi',
}
------------------------------------------------------------------
CLASS:

class Fibinocci {
     public previousNo:number;
     public currentNo:number;

    constructor(previousNo, currentNo) {
        this.previousNo = previousNo;
        this.currentNo = currentNo;
    }

    next() {
        return this.previousNo + this.currentNo;
    }
}

const fib=new Fibinocci(1,2);
------------------------------------------------------------------




*/