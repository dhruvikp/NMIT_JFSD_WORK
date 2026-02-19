import { Component } from '@angular/core';

@Component({
  selector: 'app-servers',
  imports: [],
  templateUrl: './servers.html',
  styleUrl: './servers.css',
})
export class Servers {

  serverName = 'Production Server';

  isDisabled = true;

  onCreateServer() {
    console.log('A server was created!');
  }

}
