import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AvgRatingForHotelComponent } from './avg-rating-for-hotel.component';

describe('AvgRatingForHotelComponent', () => {
  let component: AvgRatingForHotelComponent;
  let fixture: ComponentFixture<AvgRatingForHotelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AvgRatingForHotelComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AvgRatingForHotelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
