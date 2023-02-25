import { Component, OnInit } from '@angular/core';
import { Review } from '../review';
import { ReviewDTO } from '../review-dto';
import { ReviewService } from '../review.service';

@Component({
  selector: 'app-view-reviews',
  templateUrl: './view-reviews.component.html',
  styleUrls: ['./view-reviews.component.css']
})

export class ViewReviewsComponent    {
//   starRating:number[]=[1,2,3,4,5]

//   countStar(starRating) {
//     this.selectedValue = starRating;
//     console.log('Value of star', starRating);
// }

allReviews:ReviewDTO[]=[]

  constructor(private reviewService: ReviewService) {

    reviewService.getAllReviewsFromSpring().subscribe(

      data=>{
        this.allReviews=data;
      },
      err=>{
        console.log("Error"+err);
  
      }
    );
    

}
}
