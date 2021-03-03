// Q1
// ______________________________________________________________
// in js
async const x{
    return Math.floor(Math.random()*100)+1;
}
async const y{
    return Math.floor(Math.random()*100)+1;
}

Promise.all([x,y]).then() => console.log('All Worked');
 



// Q2
// ______________________________________________________________
class Account{
   public id_:number;
   public name_:string;
   public balance:number;
   public static totBalance:number
   constructor(id_:number,name_:string,balance:number){
    this.id_=id_;
    this.name_=name_;
    this.balance=balance;
    Account.totBalance+=balance;
   }
}

class Savings extends Account{
    public interset:number;
    constructor(id_,name_,balance,interest){
        super(id_,name_,balance);
        this.interset=interest;
    }
}

class Current extends Account{
    public cash_credit:number;
    constructor(id_,name_,balance,cash_credit){
        super(id_,name_,balance);
        this.cash_credit=cash_credit;
    }
}

// Q3
//______________________________________________________________
interface Printable{
    printAll():void;
}

class Circle implements Printable{
    radius:number;
    area:number;
    perimeter:number;
    constructor(radius){
        this.radius=radius;
        this.area=Math.PI*(radius**2);
        this.perimeter=Math.PI*2*radius;
    }
    printAll(){
        console.log(this.radius,this.area,this.perimeter);
    }
}

class Employee implements Printable{ 
    id:number;
    name:string;
    printAll(){
        console.log(this.id,this.name);
    }

}