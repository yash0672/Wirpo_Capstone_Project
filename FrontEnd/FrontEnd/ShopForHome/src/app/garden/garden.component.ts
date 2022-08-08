import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-garden',
  templateUrl: './garden.component.html',
  styleUrls: ['./garden.component.css']
})
export class GardenComponent implements OnInit {
  productListGarden: { title: string, description: string ,image:string,price: number,category:string}[] = [
    {"title":"Flowers","description":"this is dish","image":"assets/Flower.jpg","price":10,"category":"Garden & Outdoor"},
    {"title":"Flower Pots","description":"this is glass","image":"assets/flowerpot.jpg","price":12,"category":"Garden & Outdoor"},
    {"title":"Garden Hoses","description":"this is Cup","image":"assets/gardenhoses.jpg","price":2,"category":"Garden & Outdoor"}
];
  constructor() { }

  ngOnInit(): void {
  }

}
