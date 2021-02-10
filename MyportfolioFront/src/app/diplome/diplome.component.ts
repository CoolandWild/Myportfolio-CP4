import { Component, OnInit } from '@angular/core';
import { Diplome } from '../models/diplome';

@Component({
  selector: 'app-diplome',
  templateUrl: './diplome.component.html',
  styleUrls: ['./diplome.component.scss']
})
export class DiplomeComponent implements OnInit {
  diplomes: Diplome;
  constructor() { }

  ngOnInit(): void {
  }

}
