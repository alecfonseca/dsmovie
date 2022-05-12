package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

	private long movieid;
	private String email;
	private Double score;

	public ScoreDTO() {

	}

	public long getMovieid() {
		return movieid;
	}

	public void setMovieid(long movieid) {
		this.movieid = movieid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
