import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Diploma } from '../models/diploma';

@Injectable({
  providedIn: 'root'
})
export class DiplomeService {
  readonly URL: string = 'http://localhost:8080/diplomas/';

  constructor(private httpClient: HttpClient) {}

  getAllDiplomas(): Observable<Diploma[]> {
    return this.httpClient.get<Diploma[]>(this.URL);
  }

  getDiplomaById(id: string): Observable<Diploma> {
    return this.httpClient.get<Diploma>(this.URL + id);
  }

  addDiplomas(diploma: Diploma[]): Observable<Diploma> {
    return this.httpClient.post<Diploma>(this.URL, diploma)
    ;
  }
  deleteDiploma() {
    let endPoints = "/diplomas/1"
    this.httpClient.delete(this.URL + endPoints).subscribe(data => {
      console.log(data);
    });
  }
}
