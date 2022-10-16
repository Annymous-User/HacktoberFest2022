// Java program to demonstrate 

// system(ZoneId) method of Clock class 

import java.time.*; 

// create class 

public class clock { 

	// Main method 
  public static void main(String[] args) 

	{ 

		// create a Zone Id for Europe/Paris 

		ZoneId zoneId = ZoneId.of("Europe/Paris"); 

		// create Clock with system(zoneId) method 

		Clock clock = Clock.system(zoneId); 

		// get instant of class 

		Instant instant = clock.instant(); 

		// get ZonedDateTime object from instantObj to get date time 

		ZonedDateTime time = instant.atZone(clock.getZone()); 

		// print details of time 

		System.out.println("Instant for class is " + time.toString()); 

	} 

} 
