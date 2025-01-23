package com.exmaple;

public class Movie {
	private String movieName;
	private String movieRating;
	private String releaseYear;
	private double Duration;

	public Movie(String movieName, String movieRating, String releaseYear, double duration) {
		super();
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.releaseYear = releaseYear;
		Duration = duration;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getDuration() {
		return Duration;
	}

	public void setDuration(double duration) {
		Duration = duration;
	}

}
