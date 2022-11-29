package a6;

public class CityStadiumRow extends AbstractRow implements Comparable<CityStadiumRow>{
	
	private String[] cityStadiumRow = new String[5];
	
	
	public void cityStadiumRow(String cityName, String cityId, String stadium, String teamName, String capacity) {
		cityStadiumRow[0] = cityName;
		cityStadiumRow[1] = cityId;
		cityStadiumRow[2] = stadium;
		cityStadiumRow[3] = teamName;
		cityStadiumRow[4] = capacity;
	}
	
	
	@Override
	public boolean equals(String input) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int compareTo(CityStadiumRow o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
