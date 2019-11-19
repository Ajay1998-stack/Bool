import { Component, OnInit, ViewChild} from '@angular/core';
import {MatTableDataSource} from '@angular/material/table';
import {MatSort} from '@angular/material/sort';



export interface PeriodicElement {
  comments: string;
  station: string;
  regno: number;
  availability: string;
  no: number;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {no: 1, availability: 'Hydrogen', regno: 1.0079, comments: 'H',station: 'afga'},
  {no: 2, availability: 'Helium', regno: 4.0026, comments: 'He',station: 'adga'},
  {no: 3, availability: 'Lithium', regno: 6.941, comments: 'Li',station: 'sfgsh'},
  {no: 4, availability: 'Beryllium', regno: 9.0122, comments: 'Be',station: 'sfhdte'},
  {no: 5, availability: 'Boron', regno: 10.811, comments: 'B',station: 'w4etw5'},
  {no: 6, availability: 'Carbon', regno: 12.0107, comments: 'C',station: 'qwsx'},
  {no: 7, availability: 'Nitrogen', regno: 14.0067, comments: 'N',station: 'adgyet'},
  {no: 8, availability: 'Oxygen', regno: 15.9994, comments: 'O',station: 'azsd'},
  {no: 9, availability: 'Fluorine', regno: 18.9984, comments: 'F',station: 'gr'},
  {no: 10, availability: 'Neon', regno: 20.1797, comments: 'Ne',station: 'sdgeer'},
];

@Component({
  selector: 'app-bikes-and-veh',
  templateUrl: './bikes-and-veh.component.html',
  styleUrls: ['./bikes-and-veh.component.css']
})


export class BikesAndVehComponent implements OnInit {

  constructor() { }

  displayedColumns: string[] = ['no', 'regno', 'availability', 'comments', 'station'];
  dataSource = new MatTableDataSource(ELEMENT_DATA);

  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  @ViewChild(MatSort, {static: true}) sort: MatSort;

  ngOnInit() {
    this.dataSource.sort = this.sort;
  }

}
