import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-decor',
  templateUrl: './decor.component.html',
  styleUrls: ['./decor.component.css']
})
export class DecorComponent implements OnInit {
  productListDecor: { title: string, description: string ,image:string,price: number,category:string}[] = [
    {"title":"Flower Vase","description":"this is dish","image":"assets/flowervase.jpg","price":10,"category":"Decor"},
    {"title":"Wall Art","description":"this is glass","image":"assets/wallart.jpg","price":5,"category":"Decor"},
    {"title":"Show Piece","description":"this is Cup","image":"assets/showpiece.jpeg","price":25,"category":"Decor"}
];
  constructor() { }

  ngOnInit(): void {
  }

}
