import { Component, OnInit } from '@angular/core';
import { Job } from '../models/job';

@Component({
  selector: 'app-job',
  templateUrl: './job.component.html',
  styleUrls: ['./job.component.scss']
})
export class JobComponent implements OnInit {
  jobs: Job;
  constructor() { }

  ngOnInit(): void {
  }

}
