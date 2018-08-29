import { Injectable } from '@angular/core';
import {Http, Headers} from '@angular/http';
@Injectable({
  providedIn: 'root'
})
export class GetSortedTeamService {

  constructor(private http: Http) {
  }

  getTeamList() {
    let url = 'http://localhost:8181/app/teams/list';
    let headers = new Headers({
      'Content-Type': 'application/json',
      'x-auth-token': localStorage.getItem('xAuthToken')
    });

    return this.http.get(url, {headers: headers});
  }
}
