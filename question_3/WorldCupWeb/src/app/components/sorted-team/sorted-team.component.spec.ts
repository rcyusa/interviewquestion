import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SortedTeamComponent } from './sorted-team.component';

describe('SortedTeamComponent', () => {
  let component: SortedTeamComponent;
  let fixture: ComponentFixture<SortedTeamComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SortedTeamComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SortedTeamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
