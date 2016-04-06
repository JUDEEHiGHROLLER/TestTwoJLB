package edu.saintjoe.cs.judeb.TestTwoJLB;

public class TestTwo {
	public class TesTwo {
		int[] areaCells;
		int numOfHits = 0;

		public void SetareaCells (int[] area){
			areaCells = area;
		}
	public String checkYourself (String stringGuess) {
		int guess = Integer.parseInt (stringGuess);
		String result = "Close, but no cigar";
		for (int cell : areaCells) {
			if (guess == cell) {
				result = "Bingo";
				numOfHits++;
				break;
				
			}
		}

		if (numOfHits ==
			areaCells.length) {
			result = "You sunk my battleship";
			}
		System.out.println(result);
		return result;

	
	}
	}	
	}
