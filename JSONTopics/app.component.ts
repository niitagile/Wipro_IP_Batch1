import { Component } from '@angular/core';
import studentsData from './students.json';
    
interface Student {  
    id: Number;  
    name: String;  
    email: String;  
    gender: String;  
}  
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'jsonexample';
  students: Student[] = studentsData;  
}
