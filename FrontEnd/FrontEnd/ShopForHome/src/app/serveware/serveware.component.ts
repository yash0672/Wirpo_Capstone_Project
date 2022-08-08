import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-serveware',
  templateUrl: './serveware.component.html',
  styleUrls: ['./serveware.component.css']
})
export class ServewareComponent implements OnInit {
  productListServeware: { title: string, description: string ,image:string,price: number,category:string}[] = [
    {"title":"Bowl Sets","description":"this is dish","image":"assets/bowl set.jpg","price":15,"category":"Serveware"},
    {"title":"Serving Platter","description":"this is glass","image":"assets/servingplatter.jpg","price":5,"category":"Serveware"},
    {"title":"Jugs","description":"this is Cup","image":"assets/jug.jpg","price":2,"category":"Serveware"}
];
  constructor() { }

  ngOnInit(): void {
  }

}
