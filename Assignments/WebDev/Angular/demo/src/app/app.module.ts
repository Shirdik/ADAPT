
import{NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import{CommonModule} from '@angular/common'
import {AppComponent} from './ngfor';



@NgModule({
  declarations:[AppComponent],
  imports:[
    BrowserModule,
    CommonModule,
  ],
  bootstrap:[AppComponent]
})
export class AppModule{

}
