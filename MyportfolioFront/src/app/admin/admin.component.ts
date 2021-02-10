import { FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Diploma } from '../models/diploma';
import { Job } from '../models/job';
import { Hobbie } from '../models/hobbie';
import { Creation } from '../models/creation';
import { DiplomeService } from '../services/diplome.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {
  diplomeInput = this.fb.group({
    id: [''],

    title: ['', [Validators.required, Validators.minLength(3)]],

    date: ['', [Validators.required, Validators.minLength(3)]],
    });

  jobInput = this.fb.group({
    id: [''],

    title: ['', [Validators.required, Validators.minLength(3)]],

    enterprise: ['', [Validators.required, Validators.minLength(3)]],

    date: ['', [Validators.required]],
    });

  hobbieInput = this.fb.group({
    id: [''],

    title: ['', [Validators.required, Validators.minLength(3)]],

    picture: ['', [Validators.required]],
    });

  creationInput = this.fb.group({
    id: [''],

    title: ['', [Validators.required, Validators.minLength(3)]],

    body: ['', [Validators.required]],
    });

  diplomeAdd = false;

  diplomeRemove = false;

  jobAdd = false;

  jobRemove= false;

  hobbieAdd= false;

  hobbieRemove= false;

  creationAdd = false;

  creationRemove= false;

  newDiplome: Diploma[];

  diplome: Diploma[];

  newJob: Job[];

  job: Job[];

  newHobbie : Hobbie[];

  hobbie: Hobbie[];

  newCreation : Creation[];

  creation : Creation[];

  constructor(private fb: FormBuilder, private diplomeService: DiplomeService) { }

  diplomes : Diploma[];

  addDiplome() {
    this.diplomeAdd = !this.diplomeAdd;
  }
  removeDiplome() {
    this.diplomeRemove = !this.diplomeRemove;
  }
  submitDiplome() {
    this.newDiplome = this.diplomeInput.value;
  }
  addJob() {
    this.jobAdd = !this.jobAdd;
  }
  removeJob() {
    this.jobRemove = !this.jobRemove;
  }
  submitJob() {
    this.newJob = this.jobInput.value;
  }
  addHobbie() {
    this.hobbieAdd = !this.hobbieAdd;
  }
  removeHobbie() {
    this.hobbieRemove = !this.hobbieRemove;
  }
  submitHobbie() {
    this.newHobbie = this.hobbieInput.value;
  }
  addCreation() {
    this.creationAdd = !this.creationAdd;
  }
  removeCreation() {
    this.creationRemove = !this.creationRemove;
  }
  submitCreation() {
    this.newCreation = this.creationInput.value;
  }

  DiplomePost(diplome) {
    this.diplomeService.addDiplomas(this.diplome).subscribe((diplome) =>{
      this.newDiplome.push(diplome);
    })
  };
  ngOnInit(): void {
    this.diplomeService.getAllDiplomas().subscribe((data ) =>{
      this.diplomes = data;
    });
  }

}
