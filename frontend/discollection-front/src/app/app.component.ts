import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Bienvenido a Discollection';

  proyecto: string = 'App para gestión de colección de discos';
  
  autor: string = 'Santiago Rodríguez LLorente';
}
