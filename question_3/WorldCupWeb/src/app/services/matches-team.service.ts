import { Injectable } from '@angular/core';
import {Http, Headers} from '@angular/http';
@Injectable({
  providedIn: 'root'
})
export class MatchesTeamService {

  constructor(private http: Http) {
  }

  getMatcheList() {
    let url = 'http://localhost:8181/matche/list';
    let headers = new Headers({
      'Content-Type': 'application/json',
      'x-auth-token': localStorage.getItem('xAuthToken')
    });

    return this.http.get(url, {headers: headers});
  }
}
