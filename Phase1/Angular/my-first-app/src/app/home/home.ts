import { CommonModule } from '@angular/common';
import { Component, ViewChild } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-home',
  imports: [FormsModule, CommonModule],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
  
  @ViewChild('userData') form!: NgForm;

  submitted = false;

  user = {
    username: '',
    email: '',
    secret: '',
  }

  onSubmit() {
    console.log(this.form);
    this.submitted = true;
    this.user.username = this.form.value.userData.username;
    this.user.email = this.form.value.userData.email;
    this.user.secret = this.form.value.userData.secret;
    this.form.reset();
  }

  suggestUsername() {
    const suggestedUsername = "superuser";
    // this.form.form.controls['username'].setValue(suggestedUsername);

    this.form.form.patchValue({

      userData: {
        username: suggestedUsername
      }
    });
  }
}