import { Component, OnInit } from '@angular/core';
import studentsData from './students.json';
import { HttpClient } from "@angular/common/http";    
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
export class AppComponent implements OnInit{
  title = 'jsonexample';
  students: Student[] = studentsData;
  product: any=[];
  constructor(private httpClient: HttpClient) {} 
  ngOnInit(): void {
    this.httpClient.get("assets/product.json").subscribe(data=> {this.product=data;});
  }

}
