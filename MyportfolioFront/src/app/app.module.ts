import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { JobComponent } from './job/job.component';
import { CreationComponent } from './creation/creation.component';
import { HobbieComponent } from './hobbie/hobbie.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { DiplomeComponent } from './diplome/diplome.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    JobComponent,
    CreationComponent,
    HobbieComponent,
    HomeComponent,
    AdminComponent,
    DiplomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
