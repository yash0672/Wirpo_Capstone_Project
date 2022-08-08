import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-kitchen',
  templateUrl: './kitchen.component.html',
  styleUrls: ['./kitchen.component.css']
})
export class KitchenComponent implements OnInit {
  productListKitchen: { title: string, description: string ,image:string,price: number,category:string}[] = [
    {"title":"Dishes","description":"this is dish","image":"assets/Dish.jpg","price":222,"category":"Kitchen"},
    {"title":"Glasses","description":"this is glass","image":"assets/Glass.jpg","price":212,"category":"Kitchen"},
    {"title":"Cups","description":"this is Cup","image":"assets/Cup.jpg","price":210,"category":"Kitchen"}
];

  constructor() { }

  ngOnInit(): void {
    
  }

}
