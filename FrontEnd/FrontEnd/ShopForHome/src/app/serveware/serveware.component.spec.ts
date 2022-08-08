import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServewareComponent } from './serveware.component';

describe('ServewareComponent', () => {
  let component: ServewareComponent;
  let fixture: ComponentFixture<ServewareComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServewareComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServewareComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
