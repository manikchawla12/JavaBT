import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowallComponent } from './showall/showall.component';
import { AddProductComponent } from './add-product/add-product.component';

const routes: Routes = [
  {path:'',component: ShowallComponent},
  {path:'showall',component: ShowallComponent},
  {path:'addProduct', component:AddProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
