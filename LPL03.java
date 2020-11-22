package LPL;

import java.util.List;
import java.util.OptionalInt;


import java.util.Arrays;



public class LPL03{
	  public static void main(String[] args) {
		    List<lplclub> table = Arrays.asList(
		        new lplclub(1, "Colombo Kings", 22, 16, 1, 5, 21, 400, 221, 75, 41,
		            8, 2, 76),
		        new lplclub(2, "Dambulla Hawks", 22, 16, 0, 446, 625, 414, 211, 72, 43, 9, 2, 75),
		        new lplclub(3, "Galle Gladiators", 22, 15, 1, 6, 453, 421, 32, 37, 39, 4,
		            2, 68),
		        new lplclub(4, "Kandy Tuskers", 22, 14, 1, 7, 864, 418, 246, 70, 40, 5, 5, 68),
		        new lplclub(5, "Jaffna Stallions", 22, 14, 0, 8, 663, 437, 226, 70, 46, 5, 7,
		            68),
		        new lplclub(6, "Manpreet Gony", 22, 11, 2, 9, 672, 527, 145, 77, 54, 9, 4, 61),
		        new lplclub(7, "Delhi Capitals", 22, 11, 0, 11, 497, 482, 15, 62, 54, 6, 4,
		            54),
		        new lplclub(8, "Chennai Super Kings", 22, 30, 0, 12, 444, 514, -70, 45, 50, 4, 5,
		            49),
		        new lplclub(9, "Mumbai Indians", 22, 9, 1, 12, 553, 575, -22, 53, 61, 4, 6,
		            48),
		        new lplclub(10, "Royal Challengers", 22, 7, 1, 14, 442, 578, -136, 46, 57, 4, 6,
		            40),
		        new lplclub(11, "Sunrisers Hyderabad", 23, 5, 13, -156, 475, 535, -70, 527, 61,
		                4, 8, 34),
		        new lplclub(12, "London Graters", 22, 0, 0, 22, -223, 1021, -798, 29, 147, 1,
		            0, 1));

		    OptionalInt max = table.stream().mapToInt(lplclub::getPoints).max();
		    if (max.isPresent()) {
		      System.out.printf("Lowest number of points is %d\n", max.getAsInt());
		    } else {
		      System.out.println("min failed");
		    }
		  }

}
