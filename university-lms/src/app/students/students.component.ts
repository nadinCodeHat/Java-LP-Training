import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { StudentService } from './student.service';
import { Student } from './students.model';

@Component({
  selector: 'lms-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.scss']
})
export class StudentsComponent implements OnInit, OnDestroy {

  title: string = "Student Learning Management System"
  students!: Student[];
  filteredStudents!: Student[];
  showIcon: boolean = false;
  message: string = "";
  subscriber!: Subscription;

  private _degreeProgramFilter: string = "";

  set degreeProgramFilter(value: string) {
    this._degreeProgramFilter = value;
    this.filterByDegreeProgram();
  }

  get degreeProgramFilter(): string {
    return this._degreeProgramFilter;
  }

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.studentService.getStudents().subscribe({
      next: data => {
        this.filteredStudents = data;
        this.students = this.filteredStudents
      }
    })
  }

  ngOnDestroy() {
    this.subscriber.unsubscribe()
  }

  toggleAvatar() {
    this.showIcon = !this.showIcon;
  }

  filterByDegreeProgram() {
    this.filteredStudents = this.students.filter(student => student.degreeProgram.includes(this.degreeProgramFilter))
  }

  onMessageRecieved(value: string) {
    this.message = value;
  }

}