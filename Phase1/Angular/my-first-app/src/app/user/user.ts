import { Component, OnDestroy, OnInit } from '@angular/core';
import { UserService } from '../user-service';
import { CommonModule } from '@angular/common';
import { Counter } from '../counter';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-user',
  imports: [CommonModule],
  templateUrl: './user.html',
  styleUrl: './user.css',
})
export class User implements OnInit, OnDestroy{

  users: any[] = [];
  counter = 0;
  subscription!: Subscription;

  constructor(private userService: UserService) {
  }

  ngOnInit() {
    // this.subscription = this.Counter.getSeconds().subscribe(count => {
    //   this.counter = count;
    // });

    // this.subscription = this.Counter.getCounter().subscribe(count => {
    //   this.counter = count;
    // });

    this.subscription = this.userService.getUsers().subscribe({
      next: (data) => {
        this.users = data;
      },
      error: (err) => {
        console.error('Error fetching users:', err);
      }
    })
  }
  
  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }



}
