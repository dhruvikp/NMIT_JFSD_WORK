import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-servers',
  imports: [FormsModule],
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
