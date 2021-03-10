import { Component } from '@angular/core';
interface Passenger{
  id:number;
  name:string;
  checkIn:boolean;
  checkedInDate?:number|null;
}

@Component({
  selector: 'app-root',
  styleUrls:['app.component.css'],
  templateUrl:'ngfor.html'
})
export class AppComponent{

  passengers:Passenger[]=[{
    id:1,
    name:'Shirdi',
    checkIn:true,
    checkedInDate:1490742000000
  },{
    id:2,
    name:'Chandrika',
    checkIn:false
  },{
    id:3,
    checkIn:true,
    name:'Venkat',
    checkedInDate:1490742000000
  },{
    id:4,
    checkIn:false,
    name:'Ganga'
  }

]

}
