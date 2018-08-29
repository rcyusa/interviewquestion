import { Component, OnInit } from '@angular/core';
import {MatchResult} from '../../models/MatchResult';
import {GetSortedTeamService} from '../../services/get-sorted-team.service';

import {Router} from '@angular/router';

import {MatDialog} from '@angular/material';
@Component({
  selector: 'app-sorted-team',
  templateUrl: './sorted-team.component.html',
  styleUrls: ['./sorted-team.component.css']
})
export class SortedTeamComponent implements OnInit {

  private teamList: MatchResult[] = new Array();

  constructor(private getSortedTeamService: GetSortedTeamService,
              private router: Router,
              public dialog: MatDialog) {
  }



  sortedTeamList() {
    this.getSortedTeamService.getTeamList().subscribe(
      res => {
        console.log(res.json());
        this.teamList = res.json();
      },
      error => {
        console.log(error);
      }
    );
  }

  ngOnInit() {
    this.sortedTeamList();
  }

}
