import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { DirectivaComponent } from './directiva/directiva.component';
import { AlbumsComponent } from './albums/albums.component';
import { AlbumFormComponent } from './albums/album-form.component';


import { AlbumService } from './albums/album.service';


const routes: Routes = [
  {path: '', redirectTo: '/albums' ,pathMatch: 'full'},
  {path: 'directivas', component: DirectivaComponent},
  {path: 'albums', component: AlbumsComponent},
  {path: 'albums/form', component: AlbumFormComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    DirectivaComponent,
    AlbumsComponent,
    AlbumFormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [AlbumService],
  bootstrap: [AppComponent]
})
export class AppModule { }
