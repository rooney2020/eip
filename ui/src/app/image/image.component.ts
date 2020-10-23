import { Component } from '@angular/core';
import {Image} from "./Image";

@Component({
  selector: 'app-image',
  templateUrl: './image.component.html',
  styleUrls: ['./image.component.css']
})
export class ImageComponent {
  image: Image = {
    width: 200,
    height: 300,
    src: "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2539463171,1117838054&fm=26&gp=0.jpg",
    alt: "Hello"
  };

}
