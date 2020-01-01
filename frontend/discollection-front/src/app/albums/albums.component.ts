import { Component, OnInit } from '@angular/core';
import { Album } from './album';
import { AlbumService } from './album.service';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.component.html'
})
export class AlbumsComponent implements OnInit {

  albums: Album [];

  constructor(private albumService: AlbumService) {
  }

  ngOnInit() {
    this.albumService.getAlbums().subscribe(
      albums => this.albums = albums
    );
  }

}
