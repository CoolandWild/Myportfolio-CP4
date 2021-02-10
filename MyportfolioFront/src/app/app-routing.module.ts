import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { CreationComponent } from './creation/creation.component';
import { DiplomeComponent } from './diplome/diplome.component';
import { HobbieComponent } from './hobbie/hobbie.component';
import { HomeComponent } from './home/home.component';
import { JobComponent } from './job/job.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'creation', component: CreationComponent },
  { path: 'job', component:JobComponent },
  { path: 'diplome', component:DiplomeComponent },
  { path: 'hobbie', component: HobbieComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
