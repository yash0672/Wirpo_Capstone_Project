import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder } from '@angular/forms';
import { Router} from '@angular/router';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent implements OnInit {

  public FilterForm !: FormGroup ;
  constructor(private formBuilder : FormBuilder,private router:Router) { }


  ngOnInit(): void {
    this.FilterForm = this.formBuilder.group({
      searchText:['']
    })
  }

  Search():void{
    this.router.navigate(['/kitchen'],{queryParams:{text:this.FilterForm.value.searchText}});
    this.FilterForm.reset();
    console.log(this.FilterForm.value.searchText);
  }   

}
