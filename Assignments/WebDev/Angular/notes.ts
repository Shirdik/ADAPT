 /*
 Angular-->
 Modules-->building blocks or structure of the application
 Components--> contains a template, data and logic, forming part of DOM(Document Object Model) tree.
 Direcives-->Attach behavior, extend or transform a purticular element and its children.
 Services-->Data layer, logic that is not component related, such as API request
 Routing--> Render a component based on URL state, drives navigation

=================================================================
IMPORT:
=================================================================
__saved in file 'formatter.ts'__
export function uppercase(str: string){
    return str.toUpperCase();
}
-----------------------------------------------------------------
import {uppercase} from './formatter'

-----------------------------------------------------------------
Property Binding
-----------------------------------------------------------------
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  styleUrls:['app.component.css'],
  template:`
  <div>
   <h1>{{title}}</h1> --> for Angular
   <h1 [innerHTML]>'title'</h1> --> normal 1-way dataflow
   <input type='text' [value]='title'> -->doesn't change the other elements
   <div>
      {{isH?':)':':('}}
    </div>
  </div>
  `
})
export class AppComponent {
  title:string='Hello';
  }
}

-----------------------------------------------------------------
Event Binding
-----------------------------------------------------------------
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  styleUrls:['app.component.css'],
  template:`
  <div class='app'>
    <button
    (click)='handleClick($event)'
    >Reset!</button>
    <input
    type='text'
    [value]='name'
    (input)='handleInput($event)'
    (blur)='handleBlur($event)'
    >
    {{name}}
  </div>
  `
})
export class AppComponent {
  name:string='Shirdi';
handleInput(event:any){
  this.name=event.target.value;
}
handleBlur(event:any){
  this.name=event.target.value;
}
handleClick(event:any){
  this.name='';
}
}
-----------------------------------------------------------------
EVENT BINDING WITH NGMODEL
-----------------------------------------------------------------
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  styleUrls:['app.component.css'],
  template:`
  <div class='app'>
    <button
    (click)='handleClick($event)'
    >Reset!</button>
    <input
    type='text'
    [ngModel]="name"
    (ngModelChange)='handleChange($event)'
    >
    <input
    type="text"
    [(ngModel)]="name"
    >
    {{name}}
  </div>
  `
})
export class AppComponent {
  name:string='Shirdi';
handleChange(value:string){
  this.name=value;
}
handleClick(event:any){
  this.name='';
}
}

-----------------------------------------------------------------
TEMPLATE REFERENCE 
-----------------------------------------------------------------
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  styleUrls:['app.component.css'],
  template:`
  <div class='app'>
    <button
    (click)='handleClick(username.value)'
    >Get Value!</button>
    <input>
    {{name}}
  </div>
  `
})
export class AppComponent {
  name:string='Shirdi';
handleClick(username:string){
 this.name=username; 
}
}

-----------------------------------------------------------------
NG-IF
-----------------------------------------------------------------
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  styleUrls:['app.component.css'],
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

-----------------------------------------------------------------

-----------------------------------------------------------------
*/