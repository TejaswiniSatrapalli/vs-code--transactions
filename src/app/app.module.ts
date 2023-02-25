import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { BookingComponent } from './booking/booking.component';
import { ViewBookingsComponent } from './view-bookings/view-bookings.component';
import { BookingDetailsComponent } from './booking-details/booking-details.component';
import { HttpClientModule } from '@angular/common/http';


const allLinks:Routes = [
  {path:'addBooking',component:BookingComponent},
  {path:'bookings',component:BookingDetailsComponent},
  {path:'bookingsId',component:ViewBookingsComponent},
 
]

@NgModule({
  declarations: [
    AppComponent,
    BookingComponent,
    ViewBookingsComponent,
    BookingDetailsComponent,

  ],
  imports: [
    FormsModule,BrowserModule,RouterModule.forRoot(allLinks),HttpClientModule
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
