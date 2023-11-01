import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PipeProgramComponent } from './pipe-program/pipe-program.component';
import { ProductReactiveComponent } from './product-reactive/product-reactive.component';

const routes: Routes = [
  {
    path:'pipe', component:PipeProgramComponent
  },
  {
    path:'product',component:ProductReactiveComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
