package a6;

public class CityStadiumRow extends AbstractRow implements Comparable<CityStadiumRow> {

	private String[] cityStadiumRow = new String[6];

	public CityStadiumRow(String cityName, String cityPopulation, String cityId, String stadium, String teamName,
			String capacity) {
		cityStadiumRow[0] = cityName;
		cityStadiumRow[1] = cityPopulation;
		cityStadiumRow[2] = cityId;
		cityStadiumRow[3] = stadium;
		cityStadiumRow[4] = teamName;
		cityStadiumRow[5] = capacity;
	}

	public String getJoinCityName() {
		return cityStadiumRow[0];
	}

	public String getJoinCityPopulation() {
		return cityStadiumRow[1];
	}

	public String getJoinCityId() {
		return cityStadiumRow[2];
	}

	public String getJoinStadium() {
		return cityStadiumRow[3];
	}

	public String getJoinTeamName() {
		return cityStadiumRow[4];
	}

	public String getJoinCapacity() {
		return cityStadiumRow[5];
	}

	@Override
	public boolean equals(String input) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return String.join(", ", cityStadiumRow);

	}

	@Override
	public int compareTo(CityStadiumRow o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
