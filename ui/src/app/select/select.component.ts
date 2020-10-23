import {Component} from "@angular/core";
import {IOption} from "./IOption";

@Component({
  selector: 'app-select',
  templateUrl: './select.component.html',
  styleUrls: ['./select.component.css']
})
export class SelectComponent {
  selectOptions: Array<IOption> = [{
    value: 0,
    option: 'input'
  },{
    value: 1,
    option: 'image'
  }];
  displayKey: string = "-1";

  display(op: string) : void {
    this.displayKey = op;
  }
}
