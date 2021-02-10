import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Hobbie } from '../models/hobbie';

@Injectable({
  providedIn: 'root'
})
export class HobbieService {
  readonly URL: string = 'http://localhost:8080/hobbies/';

  constructor(private httpClient: HttpClient) {}

  getAllHobbies(): Observable<Hobbie[]> {
    return this.httpClient.get<Hobbie[]>(this.URL);
  }

  getHobbieById(id: string): Observable<Hobbie> {
    return this.httpClient.get<Hobbie>(this.URL + id);
  }

  addHobbies(hobbie: Hobbie) {
    return this.httpClient.post(this.URL, hobbie);
  }
}
