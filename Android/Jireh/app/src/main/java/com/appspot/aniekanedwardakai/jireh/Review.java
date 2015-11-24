package com.appspot.aniekanedwardakai.jireh;

/**
 * Created by Teddy on 11/23/2015.
 */
public class Review {

    private User reviewer;
    private User reviewee; //User that is being reviewed.
    private Service service; //Service being reviewed
    private int rating;
    private String comment;

    public User getReviewer() {
        return reviewer;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    public User getReviewee() {
        return reviewee;
    }

    public void setReviewee(User reviewee) {
        this.reviewee = reviewee;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
