import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Router} from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  productList: { title: string, description: string ,image:string,price: number,category:string}[] = [
    {"title":"Dishes","description":"this is dish","image":"assets/Dish.jpg","price":222,"category":"Kitchen"},
    {"title":"Glasses","description":"this is glass","image":"assets/Glass.jpg","price":212,"category":"Kitchen"},
    {"title":"Cups","description":"this is Cup","image":"assets/Cup.jpg","price":210,"category":"Kitchen"}
];
  
  searchText:string ="Cup"

  constructor(private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.route.queryParams.subscribe((params: any)=>{
      this.searchText=params.text;
    })
  }

}
