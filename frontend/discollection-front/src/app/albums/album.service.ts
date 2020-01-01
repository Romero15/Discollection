import { Injectable } from '@angular/core';
import { Album } from './album.js';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class AlbumService {
  private urlEndpointAlbum: string = 'http://localhost:8080/api/album';
  private httpHeader = new HttpHeaders({'Content-Type': 'application/json'})

  constructor(private http: HttpClient) { }

  getAlbums(): Observable<Album[]>{
    return this.http.get<Album[]>(this.urlEndpointAlbum+'/lista');
  }

  create(album: Album) : Observable<Album> {
    return this.http.post<Album>(this.urlEndpointAlbum+'/add', album, {headers: this.httpHeader})
  }
}
