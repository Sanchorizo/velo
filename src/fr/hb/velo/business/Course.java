package fr.hb.velo.business;

import java.time.LocalDateTime;

public class Course {

	private long id;
	private LocalDateTime dateCourse;
	private static long compteur = 0L;
	
	
	public Course() {
		dateCourse = LocalDateTime.now();
		id = ++compteur;
	}
	
	
}
