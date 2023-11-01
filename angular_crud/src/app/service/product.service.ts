import { Injectable } from '@angular/core';
import {Router} from '@angular/router';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import { product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient,private router:Router) { }

  getAllProduct():Observable<any>{
    return this.http.get('http://localhost:8080/all')
  }
  addProduct(product:Object):Observable<Object>{
    return this.http.post('http://localhost:8080/add',product)
  }
}
