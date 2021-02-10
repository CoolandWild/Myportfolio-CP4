import { Component, OnInit } from '@angular/core';
import { Hobbie } from '../models/hobbie';

@Component({
  selector: 'app-hobbie',
  templateUrl: './hobbie.component.html',
  styleUrls: ['./hobbie.component.scss']
})
export class HobbieComponent implements OnInit {

    hobbies: Hobbie;
  constructor() { }

  ngOnInit(): void {
  }

}
