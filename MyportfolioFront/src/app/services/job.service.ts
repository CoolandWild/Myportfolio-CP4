import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Job } from '../models/job';

@Injectable({
  providedIn: 'root'
})
export class JobService {
  readonly URL: string = 'http://localhost:8080/jobs/';

  constructor(private httpClient: HttpClient) {}

  getAllJobs(): Observable<Job[]> {
    return this.httpClient.get<Job[]>(this.URL);
  }

  getJobById(id: string): Observable<Job> {
    return this.httpClient.get<Job>(this.URL + id);
  }

  addJobs(job: Job) {
    return this.httpClient.post(this.URL, job);
  }
}
