import { Component, OnInit } from '@angular/core';
import { Creation } from '../models/creation';

@Component({
  selector: 'app-creation',
  templateUrl: './creation.component.html',
  styleUrls: ['./creation.component.scss']
})
export class CreationComponent implements OnInit {

  creations: Creation;
  constructor() { }

  ngOnInit(): void {
  }

}
