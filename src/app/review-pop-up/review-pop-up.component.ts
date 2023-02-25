import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-review-pop-up',
  templateUrl: './review-pop-up.component.html',
  styleUrls: ['./review-pop-up.component.css']
})
export class ReviewPopUpComponent {

  name:string=''
  showReviewPanel = false;
  reviewHotelId=0;
  reviewHotelName='';

  constructor(private activatedRouter:ActivatedRoute,
    private router:Router) { 
      this.name = this.activatedRouter.snapshot.params['name'];
    }

        addReview(hotelId:string)
        {
          this.reviewHotelId = parseInt(hotelId);
          this.reviewHotelName = "red wings"; // get it from DB or localStorage
          this.showReviewPanel = true;
        }
        closePanel()
        {
          this.showReviewPanel = false;
        }


      }
