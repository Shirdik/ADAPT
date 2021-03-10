import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template:`
  <div>
    <input type='text'
    [value]='name'
    (input)='handleChange($event)'
    >
    <div *ngIf='name.length>3'>Searching for...{{name}}</div>
  </div>
  `
})
export class AppComponent {
  name:string='';
handleChange(event:any){
 this.name=event.target.value;
}
}
