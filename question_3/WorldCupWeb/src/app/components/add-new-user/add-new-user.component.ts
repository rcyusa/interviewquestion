import { Component, OnInit } from '@angular/core';
import {User} from '../../models/User';
import {AddUserService} from '../../services/add-user.service';

@Component({
  selector: 'app-add-new-user',
  templateUrl: './add-new-user.component.html',
  styleUrls: ['./add-new-user.component.css']
})
export class AddNewUserComponent implements OnInit {

  private newUser: User = new User();
  private userAdded: boolean;

  constructor(private addUserService: AddUserService)  {
  }

  onSubmit() {
    this.addUserService.sendUser(this.newUser).subscribe(
      res => {
        this.userAdded = true;
        this.newUser = new User();
      },
      error => {
        console.log(error);
      }
    );
  }

  ngOnInit() {
    this.userAdded = false;
  }
}
