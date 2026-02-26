import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import { Counter } from '../counter';
import { Subscription } from 'rxjs';
import { AsyncPipe } from '@angular/common';

@Component({
  selector: 'app-contact',
  imports: [AsyncPipe],
  templateUrl: './contact.html',
 
  styleUrl: './contact.css',
})
export class Contact {
  counter$: any;

  constructor(private router: Router, private counterService: Counter) {
    this.counter$ = this.counterService.getCounter();
  }

  goHome() {
    this.router.navigate(['/home']);
  }
}
