export class ReviewDTO {

    id : number;
    hotelId:number;
    roomId:number;
    starRating: number;
	userReviewMsge : string;

    constructor( 
       
    id : number,
    hotelId:number,
    roomId:number,
	starRating : number,
	userReviewMsge : string,

    ){

        this.id=id;
        this.hotelId=hotelId;
        this.roomId=roomId;
        this.starRating=starRating;
        this.userReviewMsge=userReviewMsge;
       
    }
}
