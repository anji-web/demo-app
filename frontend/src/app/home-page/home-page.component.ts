import { Component, OnInit } from '@angular/core';
import { UserList } from "../UserList";
import { ServiceService } from "../service/service.service";

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent implements OnInit {
  user : UserList;
  constructor(private service: ServiceService) { }

  ngOnInit(): void {
    this.getListData();
  }

  getListData(){
    this.service.getDataList().subscribe(
      {
        next: data => this.user = data,
        error: err => console.warn(err)
      }
    )
  }

}
