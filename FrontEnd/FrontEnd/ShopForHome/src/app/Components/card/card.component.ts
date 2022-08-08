import { Component, OnInit,Input } from '@angular/core';
import { ActivatedRoute,Router} from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  @Input() productList:any;
 
  
  searchText:string ="Cup"

  constructor(private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.route.queryParams.subscribe((params: any)=>{
      this.searchText=params.text;
    })
  }

}
