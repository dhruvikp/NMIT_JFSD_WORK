import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-contact',
  imports: [],
  //templateUrl: './contact.html',
  template: `
    <p>contact works!</p>
    <button (click)="goHome()">Click me- Home</button>
  `,
  styleUrl: './contact.css',
})
export class Contact {

  constructor(private router: Router) {
    
  }

  goHome() {
    this.router.navigate(['/home']);
  }
}
