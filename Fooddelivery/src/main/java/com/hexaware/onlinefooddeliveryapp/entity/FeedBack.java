package com.hexaware.onlinefooddeliveryapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class FeedBack {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long feedbackId;
	
	@Column(name = "rating")
	private Integer rating;
	
	@Column(name = "comment")
	private String comment;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_restraunt_restraunt_id")
	private Restraunt restraunt;
	
	public FeedBack() {
		
	}

	public FeedBack(Integer rating, String comment, Restraunt restraunt) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.restraunt = restraunt;
	}

	public Long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Restraunt getRestraunt() {
		return restraunt;
	}

	public void setRestraunt(Restraunt restraunt) {
		this.restraunt = restraunt;
	}

	@Override
	public String toString() {
		return "FeedBack [feedbackId=" + feedbackId + ", rating=" + rating + ", comment=" + comment + ", restraunt="
				+ restraunt + "]";
	}
	
	
}
