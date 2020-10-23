import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SelectComponent } from './select/select.component';
import { InputComponent } from './input/input.component';
import { ImageComponent } from './image/image.component';
import { from } from 'rxjs';

@NgModule({
  declarations: [
    AppComponent,
    SelectComponent,
    InputComponent,
    ImageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
