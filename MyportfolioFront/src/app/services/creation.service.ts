import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Creation } from '../models/creation';

@Injectable({
  providedIn: 'root'
})
export class CreationService {
  readonly URL: string = 'http://localhost:8080/creations/';

  constructor(private httpClient: HttpClient) {}

  getAllCreations(): Observable<Creation[]> {
    return this.httpClient.get<Creation[]>(this.URL);
  }

  getCreationById(id: string): Observable<Creation> {
    return this.httpClient.get<Creation>(this.URL + id);
  }

  addCreations(creation: Creation) {
    return this.httpClient.post(this.URL, creation);
  }

}
