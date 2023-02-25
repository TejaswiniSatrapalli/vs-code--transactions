import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AboutUsComponent } from './about-us/about-us.component';

import { RoomsComponent } from './rooms/rooms.component';
import { BookingsComponent } from './bookings/bookings.component';
import { TransactionsComponent } from './transactions/transactions.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { ReviewComponent } from './review/review.component';
import { UserComponent } from './user/user.component';
import { HotelComponent } from './hotel/hotel.component';
import { ViewReviewsComponent } from './view-reviews/view-reviews.component';
import { ReviewPopUpComponent } from './review-pop-up/review-pop-up.component';
import { AvgRatingForHotelComponent } from './avg-rating-for-hotel/avg-rating-for-hotel.component';
import { TransactionListComponent } from './transaction-list/transaction-list.component';
import { TransactionComponent } from './transaction/transaction.component';
import { TransactionByDateComponent } from './transaction-by-date/transaction-by-date.component';
import { TransactionByIdComponent } from './transaction-by-id/transaction-by-id.component';

const allLinks:Routes=[

  {path:'hotels',component:HotelComponent},
  {path:'review',component:ReviewComponent},
  {path:'rooms',component:RoomsComponent},
  {path:'bookings',component:BookingsComponent},
  {path:'transactions',component:TransactionsComponent},
  {path:'about-us',component:AboutUsComponent},
  {path:'viewReviews',component:ViewReviewsComponent},
  {path:'feedback',component:ReviewPopUpComponent},
  {path:'avgRating-Hotel',component:AvgRatingForHotelComponent},
  {path:'addtransaction',component:TransactionComponent},
  {path:'viewtransactionDetails',component:TransactionListComponent},
  {path:'transactions',component:TransactionsComponent},
  {path:'transactionsByDate',component:TransactionByDateComponent},
  {path:'transactionsByid',component:TransactionByIdComponent},

]


@NgModule({
  declarations: [

    AppComponent,
    AboutUsComponent,
    HotelComponent,
    RoomsComponent,
    BookingsComponent,
    TransactionComponent,
    TransactionListComponent,
    TransactionsComponent,
    HeaderComponent,
    ReviewComponent,
    UserComponent,
    HotelComponent,
    ViewReviewsComponent,
    ReviewPopUpComponent,
    AvgRatingForHotelComponent,
    TransactionByDateComponent,
    TransactionByIdComponent,
  
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(allLinks),
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
