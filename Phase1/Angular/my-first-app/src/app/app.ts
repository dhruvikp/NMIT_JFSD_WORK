import { Component, signal } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { Servers } from './servers/servers';
import { Home } from './home/home';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RouterLink, Servers, Home],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('my-first-app');

  
}
