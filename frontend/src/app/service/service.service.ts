import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Observable, throwError } from 'rxjs';
import { UserList } from "../UserList";
import { tap,catchError } from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }
  
  getDataList(): Observable<UserList>{
    return this.http.get<UserList>("http://localhost:8082/api/v2/list-user").pipe(
      tap(data => console.log("List account : " + JSON.stringify(data))),
      catchError(this.handleError)
    )
  }

  handleError(err: HttpErrorResponse){
      let message= "";
      if (err.error instanceof ErrorEvent) {
          message = "Error message : " + err.message;
      }else{
        message = `Server status : ${err.status},`
      }

      console.error(message);
      return throwError(message);
  }
}
