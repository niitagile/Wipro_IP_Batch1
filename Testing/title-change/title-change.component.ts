import { Component, OnInit } from '@angular/core';
import {  Input, EventEmitter, Output, ViewChild, ElementRef } from '@angular/core';
 
@Component({
  selector: 'app-title-change',
  templateUrl: './title-change.component.html',
  styleUrls: ['./title-change.component.css']
})
export class TitleChangeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  @Input() message: string; //1
 
  @Output() changeTitleEvent:EventEmitter<string> = new EventEmitter(); //2 
 
  @ViewChild('titleField') titleField: ElementRef;
 
  handleButtonClick(newTitle) {
    if(newTitle) {
      this.changeTitleEvent.emit(newTitle);
      this.titleField.nativeElement.value = '';
    } 
  }

}
