import { Component, OnInit } from '@angular/core';
import { Album } from './album';
import { AlbumService } from './album.service';
import { Router } from '@angular/router';
import swal from 'sweetalert2';

@Component({
  selector: 'app-album-form',
  templateUrl: './album-form.component.html'
})
export class AlbumFormComponent implements OnInit {

  private album: Album = new Album();
  private titulo: string = "Añadir Album";

  constructor(private albumService: AlbumService,
  private router: Router) { }

  ngOnInit() {
  }

  public create(): void{
    this.albumService.create(this.album)
      .subscribe(album =>{
            this.router.navigate(['/albums'])
            swal('Nuevo Album', `Album ${album.titulo} añadido con exito`, 'success')
      }
    );
  }

}
