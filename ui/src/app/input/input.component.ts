import { Component } from '@angular/core';

@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.css']
})
export class InputComponent {
  _inputValue = '';
  get inputValue(): string {
    return this._inputValue;
  }
  set inputValue(value: string) {
    this._inputValue = value;
  }
}
