export class Review {
    reviewId : number;
    hotelId:number;
    roomId:number;
    // userName:string;
    starRating : number;
	userReviewMsge : string;


    constructor( 
       
    reviewId : number,
    hotelId:number,
    roomId:number,
	starRating : number,
	userReviewMsge : string,

   
    ){

        this. reviewId= reviewId;
        // this.userName=userName;
        this.hotelId=hotelId;
        this.roomId=roomId;
        this.starRating=starRating;
        this.userReviewMsge=userReviewMsge;
       
    }
}
