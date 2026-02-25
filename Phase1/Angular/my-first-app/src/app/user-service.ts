import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user.model';

@Injectable({
  providedIn: 'root',
})
export class UserService {

    private APP_URL = 'https://jsonplaceholder.typicode.com/users';

    constructor(private http: HttpClient) {

    }

    getUsers() : Observable<User[]>{
        return this.http.get<User[]>(this.APP_URL);
    }
  
}
