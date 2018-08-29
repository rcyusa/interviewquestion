import { Component, OnInit } from '@angular/core';
import {User} from '../../models/User';
import {GetUserListService} from '../../services/get-user-list.service';
import {RemoveUserService} from '../../services/remove-user.service';
import {Router} from '@angular/router';

import {MatDialog, MatDialogRef} from '@angular/material';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  private selectedUser: User;
  private user: User[];
  private userList: User[] = new Array();

  constructor(private getUserListService: GetUserListService,
              private removeUserService: RemoveUserService,
              private router: Router,
              public dialog: MatDialog) {
  }

  onSelect(user: User) {
    this.selectedUser = user;
    this.router.navigate(['/viewUser', this.selectedUser.id]);
  }

  openDialog(user: User) {
    let dialogRef = this.dialog.open(DialogResultExampleDialog);
    dialogRef.afterClosed().subscribe(
      result => {
        console.log(result);
        if (result === 'yes') {
          this.removeUserService.sendUser(user.id).subscribe(
            res => {
              console.log(res);
              this.getUserList();
            },
            err => {
              console.log(err);
            }
          );
        }
      }
    );
  }



  getUserList() {
    this.getUserListService.getUserList().subscribe(
      res => {
        console.log(res.json());
        this.userList = res.json();
      },
      error => {
        console.log(error);
      }
    );
  }

  ngOnInit() {
    this.getUserList();
  }

}
@Component({
  selector: 'dialog-result-example-dialog',
  templateUrl: './dialog-result-example-dialog.html'
})
export class DialogResultExampleDialog {
  constructor(public dialogRef: MatDialogRef<DialogResultExampleDialog>) {
  }
}
