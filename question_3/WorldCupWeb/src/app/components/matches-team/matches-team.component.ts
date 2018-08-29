import { Component, OnInit } from '@angular/core';
import {Matche} from '../../models/Matche';
import {Router} from '@angular/router';

import {MatDialog} from '@angular/material';
import {MatchesTeamService} from '../../services/matches-team.service';
@Component({
  selector: 'app-matches-team',
  templateUrl: './matches-team.component.html',
  styleUrls: ['./matches-team.component.css']
})
export class MatchesTeamComponent implements OnInit {

  private matcheList: Matche[] = new Array();

  constructor(private getMatchesTeamService: MatchesTeamService,
              private router: Router,
              public dialog: MatDialog) {
  }



  matchesList() {
    this.getMatchesTeamService.getMatcheList().subscribe(
      res => {
        //console.log(res.json());
        this.matcheList = res.json();
        console.log(this.matcheList);
      },
      error => {
        console.log(error);
      }
    );
  }

  ngOnInit() {
    this.matchesList();
  }

}
