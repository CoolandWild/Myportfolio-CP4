import { Component, OnInit } from '@angular/core';
import { Diploma } from '../models/diploma';
import { DiplomeService } from '../services/diplome.service';

@Component({
  selector: 'app-diplome',
  templateUrl: './diplome.component.html',
  styleUrls: ['./diplome.component.scss']
})
export class DiplomeComponent implements OnInit {


  constructor(private diplomeService: DiplomeService) { }

  diplomes: Diploma[] ;

  ngOnInit(): void {
    this.diplomeService.getAllDiplomas().subscribe((data ) =>{
      this.diplomes = data;
    });
  }
}
