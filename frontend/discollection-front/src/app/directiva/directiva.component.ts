import { Component } from '@angular/core';

@Component({
  selector: 'app-directiva',
  templateUrl: './directiva.component.html'
})
export class DirectivaComponent {

  listaEstilos: string[] = ['Techno', 'IDM', 'Electro', 'Acid'];

  habilitar: boolean = true;

  constructor() { }

  setHabilitar(): void{
    this.habilitar= (this.habilitar==true)? false:true;
  }


}
