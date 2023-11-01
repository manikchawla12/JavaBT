import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PipeProgramComponent } from './pipe-program/pipe-program.component';
import { PowerPipe } from './pipe-program/pipe/power.pipe';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductReactiveComponent } from './product-reactive/product-reactive.component';


@NgModule({
  declarations: [
    AppComponent,
    PipeProgramComponent,
    PowerPipe,
    ProductReactiveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
