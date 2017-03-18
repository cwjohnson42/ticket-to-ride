package delta.monstarz.shared.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class Route {
	private int id;
    private String city1;
    private String city2;
    private int length;
    private CardColor color;
    private String owner;
    private PlayerColor trainColor;
    private List<Segment> segments;

    public Route(JsonObject jsonRoute) {

        //Parse the Endpoints
        JsonArray endpointArray = jsonRoute.get("endpoints").getAsJsonArray();
        city1 = endpointArray.get(0).getAsString();
        city2 = endpointArray.get(1).getAsString();


        //Parse the Segments
        // TODO: get rid of condition when all segments are added to json
        segments = new ArrayList<>();
        if (jsonRoute.has("segments")) {
            JsonArray jsonSegments = jsonRoute.get("segments").getAsJsonArray();
            for (int i = 0; i < jsonSegments.size(); i++) {
                segments.add(new Segment(jsonSegments.get(i).getAsJsonObject()));
            }
        }

        //Parse color
	    color = CardColor.fromString(jsonRoute.get("color").getAsString());
        length = jsonRoute.get("length").getAsInt();
    }

    public int getId() {
	    return id;
    }

	public void setId(int id) {
		this.id = id;
	}

    public List<Segment> getSegments() {
	    return segments;
    }

    public void setSegments(List<Segment> segments) {
	    this.segments = segments;
    }

    public String getOwner() {
	    return owner;
    }

    void setOwner(String owner) {
	    this.owner = owner;
    }

	public PlayerColor getTrainColor() {
		return trainColor;
	}

	public void setTrainColor(PlayerColor trainColor) {
		this.trainColor = trainColor;
	}

	public CardColor getColor() {
	    return color;
    }

    public void setColor(CardColor color) {
	    this.color = color;
    }

    public int getLength() {
	    return length;
    }

    public void setLength(int length) {
	    this.length = length;
    }

    public String getCity2() {
	    return city2;
    }

    public void setCity2(String city2) {
	    this.city2 = city2;
    }

    public String getCity1() {
	    return city1;
    }

    public void setCity1(String city1) {
	    this.city1 = city1;
    }

	public void claim(String username, PlayerColor trainColor) {
		owner = username;
		this.trainColor = trainColor;
	}
}
