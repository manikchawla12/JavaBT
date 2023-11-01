import { Component, Input } from '@angular/core';
import { product } from '../model/product';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {
  @Input() prd:product;
  msg:string='';


  constructor(private service: ProductService){
    this.prd=new product();
  }
  addProduct(){
    this.service.addProduct(this.prd).subscribe(
      data=>this.msg="record added"+JSON.stringify(data),error=>this.msg=error.error
    ); 
  }
}
