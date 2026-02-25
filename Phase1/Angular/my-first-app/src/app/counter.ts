import { Injectable } from '@angular/core';
import { Observable , interval} from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class Counter {

  getSeconds(): Observable<number> {

    return new Observable<number>(observer => {
      let count = 0;
      
      const intervalId = setInterval(() => {
        observer.next(count++);
      }, 1000);


      // clean up when unsubscribed
      return () => {
        console.log('Observable destroyed');
        clearInterval(intervalId); // Cleanup the interval when the observable is destroyed
      };

    });
  } 

  
  getCounter(): Observable<number> {
      return interval(1000); // Emits an incrementing number every second
    } 
}
