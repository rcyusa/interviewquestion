import { Component, OnInit } from '@angular/core';
import {User} from '../../models/User';
import {EditUserService} from '../../services/edit-user.service';
import {GetUserService} from '../../services/get-user.service';
import {ActivatedRoute, Params, Router} from '@angular/router';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {

  private userId: number;
  private user: User = new User();
  private userUpdated: boolean;


  constructor(private editUserService: EditUserService,
              private getUserService: GetUserService,
              private route: ActivatedRoute,
              private router: Router) {
  }

  onSubmit() {
    this.editUserService.sendUser(this.user).subscribe(
      data => {

        this.userUpdated = true;
      },
      error => console.log(error)
    );
  }

  ngOnInit() {
    this.route.params.forEach((params: Params) => {
      this.userId = Number.parseInt(params['id']);
    });

    this.getUserService.getUser(this.userId).subscribe(
      res => {
        this.user = res.json();
      },
      error => console.log(error)
    );
  }


}
