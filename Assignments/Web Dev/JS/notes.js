/*

console.log()-->for output
--> for printing values 

-----------------------------------------------------------------
Template Literal:

   console.log(`${value_1} is greater than ${value_2}`)
-----------------------------------------------------------------
Use the above syntax, better than java sysout syntax
alert-> for an alert
prompt-->to get
parseInt()--> to cast into number
Arrays:
push,pop--> work on end-->push adds to the end
shift,unshift--> work on start-->shift removes from the start
array.includes(element)-->return bool--> to find the array contains element or not
reverse-->reverses the original array-->destructive
slice(start,stop)--> to get a part--> from start to 1element before stop
splice(start,qty)-->deletes from start to the qty including the start
splice(start,qty,element)-->deletes from start to the qty including the start and replaces with the element at the start position
sort-->sorts by converting them into UTF-16 format (converts everything into strings not reliable if used directly)
toString--> to convert the array into string

FOROF LOOP-->
for(let x of array){
 console.log(x)
}

For iterating through objects use:
Object.keys
Object.values
Object.entries


=================================================================
ARROW FUNCTION-->Lambda Functions of JavaScript
=================================================================
Implicit return--> auto returns the values in the ()
const add =(a,b)=>(a+b);
const add =(a,b)=> a+b;
both works  ^

FOREACH-->create a function that does a function that applies on every element in the array-->non-destructive
array.forEach(element => {

});

MAP--> create a function that applies on elements in the array and return new array with the upadated values-->non-destructive
array.map(element => {

});


setTimeout--> to set time for fucntions, and the function works after the time interval given
setTimeout(() => {

}, timeout);

setInterval-->to set function that works at every time interval given.
const id= setInterval(() => {

}, interval);
--> To stop the setInterval we need use the clearInterval(id);

FILTER--> used to return an arrau of items which satisfies the conditions
array.filter(element => {

});

EVERY--> return ture if all the elements statisfies the condition
array.every(element => {

});

SOME--> return true if any one of the elements satifies the condition
array.some(element => {

});


REDUCE-->used to reduce the array to a single value.
array.reduce((accumulator, element)=> {
return accumulator+element;
});

-->Arrow functions are the methods of Window. So, using this keyword in the arrow function rises exception beacause it seaches for the element in the Window. We can use this keyword in Arrow function when it is nested in a normal function

SPREAD--> used to spread the elements in a iterable.
-----------------------------------------------------------------
Syntax--> ...iterable
-----------------------------------------------------------------
This spread can be used to deep copy iterables.
ex--> Math.max(...arr);
We can spread string into chars using this
While spreading mutliple iterable into one, if they have common properties, then the property value of the second iterable overrides the first one

-----------------------------------------------------------------
REST--> used to store arguments in an array
Syntax-->...arr 
-----------------------------------------------------------------
function sum(...nums){return nums.reduce(total, num)=>total+num};


DESTRUCTURING--> used to copy the elements of the iterable to individual entities--> non-destructive
FOR ITERABLES:
const scores = [929321, 899341, 888336, 772739, 543671, 243567, 111934];
const [gold, silver, bronze]= scores;
NOW--> gold=929321, silver=899341, bronze=888336
FOR OBJECTS:
const {firstname, lastname, address: location }= user;
                            ^^^^^^^^^^^^^^^
                            |||||||||||||||
The above syntax saves the value of location property of user to address variable
 if the property is not available then the decalred variable in the {curly brackets} is undefines, no exception is raised.
FOR PARAMS:
function name({firstname, lastname}){
   return `${firstname} ${lastname}`;
}

=================================================================
 DOM--> Document Object Model
=================================================================
When a web page is loaded, html objects are generated.
document.getElementById
document.getElementByClass
document.getElementByTag

document.querySelector('css syntax');--> selects the first one
document.querySelectorAll('css syntax');--> selects all the elements that satifies the selector
This query selector return a HTML Collection which contains the HTML elements
const h1 = document.querySelector('h1');
h1.innerText='Hello';--> to set
h1.innerText;--> to get
h1.getAttribute('selector');
h1.setAttribute('selector', 'setter');
we cannot get the css styles with these html objects
Setting styles through js is applied as inline styles.

h1.classList.add('newClassName');-->to add new class for the tag
h1.classList.remove('className');-->to remove class for the tag
h1.classList.contains('className');--> to check that h1 contains className or not--> return boolean
h1.classList.toggle('className');-->adds if not there, removes if its there

h1.parentElement-->gives Parent Element
h1.children--> returns array of children --> can iterate
h1.nextSibling-->returns next child node of the parent--> not useful
h1.nextElementSibling--> return next child element of the parent
h1.previousSibling-->returns next child node of the parent--> not useful
h1.previousElementSibling--> return next child element of the parent

=================================================================
HOW TO MAKE A DOM ELEMENT?
=================================================================
const h1= document.createElement('h1');
h1.innerText="Hello World!";
document.body.appendChild(h1);-->Adds as the last child to the page
const h2= document.querySelector('header');
h2.append('h1');--> appends as last child to the header
h2.prepend('h1');--> appends as first child to the header
h2.insertAdjacentElement(position,element);-->apends as adjacent element
                         ^^^^^^^^
                         ||||||||   
                         POSITION
                         ||||||||
                         vvvvvvvv
beforebegin--> before the target element
afterbegin--> inside target element, before the first child
beforeend--> inside the target element, after the last child
afterend--> after the target element

h2.after('h1');--> inserts after the h2
h2.before('h1');--> inserts before the h2


h1.remove();--> remove the element

function makeRandomColor()={
    const r= Math.floor(Math.random)*256;
    const b= Math.floor(Math.random)*256;
    const g= Math.floor(Math.random)*256;
    return `rbg(${r},${b},${g})`;
}

function colorise(){
  this.style.backgroundColor=makeRandomColor();
  this.style.backgroundColor=makeRandomColor();
}
=================================================================
EVENTS
=================================================================
There are two ways to add event to an element:
1.Inline
2.EventListner
SYNTAX:
-----------------------------------------------------------------
element.addEventListener('action',function);
-----------------------------------------------------------------
h1.addEventListener('click',colorise());

actions:
click--> on a mouse click
input--> when input is changed
change--> when the focus is out of the element and if there is a change
mousedown--> when the mouse clicked
mouseup-->when the mouse click is relaesed
keydown-->when a key in keyboard is pressed
keyup--> when a key in keyboard is relased
||||||
VVVVVV

key-->property of object--> returns the value of the key pressed.
code--> returns the keylocation(on keyboard-->left shift)

=================================================================
 CALLBACK:
=================================================================
It is nesting functions, to get desired output at specific time.
--> This is not possible normally because, the JavaScript can run only single line of code at once.
-----------------------------------------------------------------
EX:
const x= (color,doNext)=>{
  this.color= color;
  doNext();
}
 x('red',x('yellow',x('green',)));
-----------------------------------------------------------------
--> To overcome this problem, we use promises. 


=================================================================
PROMISES
=================================================================

These are used to reduce the code complexity caused by callbacks
-----------------------------------------------------------------
EX:
    const promise = (url) => {
        return new Promise(resolve, reject) => {
            const rand = Math.random();
            setTimeout(() => {
                if (rand < 0.7)
                    resolve('Resolved');
                else
                    reject('Rejected');
            }, 2000)
        }
    }


promise('url1')
    .then(
        (data) => {
            console.log('WOrked!!!(1)', data)
            return promise('url2')
        }
    ) -- >if the request worked
    .then((data) => console.log('WOrked!!!(2)', data)) --> if the second request worked
    .catch((data) => console.log('Rejected', data)) --> if there is an error in any request
-----------------------------------------------------------------
=================================================================
ASYNC
=================================================================
This keyword automatically return a promise when any function is declared as async.     
-----------------------------------------------------------------
EX:
async const promise(){
    const c=Math.random()
    if(c<0.5)
    return 'Worked!!'
    throw 'Error!!!!'
}

const promise= async ()=>{
    const c=Math.random()
    if(c<0.5)
    return 'Worked!!'
    throw 'Error!!!!'
}
-----------------------------------------------------------------
=================================================================
AWAIT
=================================================================
This keyword is used in async functions to order functions in it to wait till the prior promises resolve. --> Reduces the code complexity(need not use then to nest the functions) 
-----------------------------------------------------------------
Ex:
promise('url1')
     try{
          await (data) => console.log('WOrked!!!(1)', data)
          await (data) => console.log('WOrked!!!(2)')
     }
     catch(e){
          console.log('Rejected', e)
     }
-----------------------------------------------------------------
=================================================================
XML --> Extensive Markup Language
JSON --> JavaScript Object Notation
AJAX --> Asynchronus Javascript And XML
AJAJ --> Asynchronus Javascript and JSON

=================================================================
PROTOTYPE
=================================================================
This is a common object which contains all the functions of all types. Every datatype(array,string,..) has the reference of this prototype interface with name '__proto__' which contains all the functions

=================================================================
OOPS
-----------------------------------------------------------------
CONSTRUCTOR
=================================================================
Constructor is a function that is executed when an object is declared by taking the values of the attributes as arguments.

-----------------------------------------------------------------
Ex:
--> First letter will be capital as it is not a normal function.However, this is just a convection.
function Color(r,g,b){
    this.r=r;
    this.g=g;
    this.b=b;
}
--> The function above works as constructor only when it is used with new keyword.

const red= new Color(255,0,0);
-----------------------------------------------------------------

=================================================================
CLASSES
=================================================================

class Color{
    constructor(r,g,b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    rgb(){
        const {r,g,b}= this;
        return `rgb(${r},${g},${b})`;
    }
}

--> the constructor is added to the object and the methods are added to the __proto__

*/