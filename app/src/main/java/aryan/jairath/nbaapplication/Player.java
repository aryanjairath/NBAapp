package aryan.jairath.nbaapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Player implements Parcelable {
    private int PlayerID;
    private String Status;
    private int TeamID;
    private String Team;
    private int Jersey;
    private String PositionCategory;
    private String Position;
    private String FirstName;
    private String LastName;
    private String BirthDate;
    private String BirthCity;
    private String BirthState;
    private String BirthCountry;
    private int GlobalTeamID;
    private int Height;
    private int Weight;

    public Player(int playerID, String status, int teamID, String team, int jersey, String positionCategory, String position, String firstName, String lastName, String birthDate, String birthCity, String birthState, String birthCountry, int globalTeamID, int height, int weight)  {
        PlayerID = playerID;
        Status = status;
        TeamID = teamID;
        Team = team;
        Jersey = jersey;
        PositionCategory = positionCategory;
        Position = position;
        FirstName = firstName;
        LastName = lastName;
        BirthDate = birthDate;
        BirthCity = birthCity;
        BirthState = birthState;
        BirthCountry = birthCountry;
        GlobalTeamID = globalTeamID;
        Height = height;
        Weight = weight;
    }

    public int getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(int playerID) {
        PlayerID = playerID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getTeamID() {
        return TeamID;
    }

    public void setTeamID(int teamID) {
        TeamID = teamID;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public int getJersey() {
        return Jersey;
    }

    public void setJersey(int jersey) {
        Jersey = jersey;
    }

    public String getPositionCategory() {
        return PositionCategory;
    }

    public void setPositionCategory(String positionCategory) {
        PositionCategory = positionCategory;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getBirthCity() {
        return BirthCity;
    }

    public void setBirthCity(String birthCity) {
        BirthCity = birthCity;
    }

    public String getBirthState() {
        return BirthState;
    }

    public void setBirthState(String birthState) {
        BirthState = birthState;
    }

    public String getBirthCountry() {
        return BirthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        BirthCountry = birthCountry;
    }

    public int getGlobalTeamID() {
        return GlobalTeamID;
    }

    public void setGlobalTeamID(int globalTeamID) {
        GlobalTeamID = globalTeamID;
    }

    public String getHeight() {
        return Height+" inches";
    }

    public void setHeight(int height) {
        Height = height;
    }

    public String getWeight() {
        return Weight+ " pounds";
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
    // Getters
    protected Player(Parcel in) {
        PlayerID = in.readInt();
        FirstName = in.readString();
        LastName = in.readString();
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(PlayerID);
        parcel.writeString(FirstName);
        parcel.writeString(LastName);
    }

    @Override
    public String toString() {
        return "Player{" +
                "PlayerID=" + PlayerID + "\n"+
                ", Status='" + Status + '\'' + "\n"+
                ", TeamID=" + TeamID + "\n"+
                ", Team='" + Team + '\'' + "\n"+
                ", Jersey=" + Jersey + "\n"+
                ", PositionCategory='" + PositionCategory + '\'' + "\n"+
                ", Position='" + Position + '\'' + "\n"+
                ", FirstName='" + FirstName + '\'' + "\n"+
                ", LastName='" + LastName + '\'' + "\n"+
                ", BirthDate='" + BirthDate + '\'' + "\n"+
                ", BirthCity='" + BirthCity + '\'' + "\n"+
                ", BirthState='" + BirthState + '\'' + "\n"+
                ", BirthCountry='" + BirthCountry + '\'' + "\n"+
                ", GlobalTeamID=" + GlobalTeamID + "\n"+
                ", Height=" + Height + "\n"+
                ", Weight=" + Weight + "\n"+
                '}';
    }
}
